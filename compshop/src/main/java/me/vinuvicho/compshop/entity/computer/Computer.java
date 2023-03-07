package me.vinuvicho.compshop.entity.computer;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = "computer_type")
@ToString
public abstract class Computer {

    @SequenceGenerator(name = "computer_sequence", sequenceName = "computer_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "computer_sequence")
    private Integer computerId;
    private String name;
    private String info;

    @ManyToOne(cascade = CascadeType.ALL)
    private ComputerProperty processor;
    @ManyToOne(cascade = CascadeType.ALL)
    private ComputerProperty memory;

    private Double computerPrice;
    private Integer stock;

    public Computer(String name, String info, Double computerPrice, Integer stock) {
        this.name = name;
        this.info = info;
        this.computerPrice = computerPrice;
        this.stock = stock;
    }

    public String displayInfo() {
        return processor.displayInfo() + memory.displayInfo();
    }

    public abstract String displayName();
}
