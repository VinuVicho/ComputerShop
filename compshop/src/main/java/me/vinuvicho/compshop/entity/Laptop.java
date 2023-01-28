package me.vinuvicho.compshop.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends Computer {
    @SequenceGenerator(name = "player_sequence", sequenceName = "player_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    int id = 6;
    int screen;
}
