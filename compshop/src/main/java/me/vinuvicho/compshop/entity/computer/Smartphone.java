package me.vinuvicho.compshop.entity.computer;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone extends Computer {
    @ManyToOne(cascade = CascadeType.ALL)
    private ComputerProperty camera;

    public Smartphone(String name, String info, Double computerPrice, Integer stock) {
        super(name, info, computerPrice, stock);
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + camera.displayInfo();
    }

    @Override
    public String displayName() {
        return "Smartphone " + getName();
    }
}
