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

    @ManyToOne(cascade = CascadeType.ALL)
    private ComputerProperty weight;

    public Laptop(String name, String info, Double computerPrice, Integer stock) {
        super(name, info, computerPrice, stock);
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + weight.displayInfo();
    }

    @Override
    public String displayName() {
        return "Laptop " + getName();
    }
}
