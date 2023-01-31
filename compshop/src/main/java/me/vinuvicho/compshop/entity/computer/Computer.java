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
    private Long computerId;
    private String processorName;
    private Long cores;
    private String name;
    private String info;
    private Long memory;
    private Long computerPrice;
    private Long stock;

    public String displayInfo() {
        return "<p> This device has " + processorName + " processor with " + cores + " cores" + "</p>";
    }
}
