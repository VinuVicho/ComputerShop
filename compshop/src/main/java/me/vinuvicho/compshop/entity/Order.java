package me.vinuvicho.compshop.entity;

import lombok.*;
import me.vinuvicho.compshop.entity.computer.Computer;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "order_list")
public class Order {

    @SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    private Long id;

    private String userEmail;
    @ManyToOne()
    private Computer computer;
}
