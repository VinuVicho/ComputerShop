package me.vinuvicho.compshop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorColumn(name = "computer_type")
public abstract class Computer {
    @SequenceGenerator(name = "computer_sequence", sequenceName = "computer_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "computer_sequence")
    private Long computerId;
    private Long cores;
    private String name;
    private String info;
    private Long stock;

    public abstract String displayInfo();
}
