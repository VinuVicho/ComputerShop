package me.vinuvicho.compshop.entity.computer;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends Computer {
    private Long screen;

    @Override
    public String displayInfo() {
        return null;
    }
}
