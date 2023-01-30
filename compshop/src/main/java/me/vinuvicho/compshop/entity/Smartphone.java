package me.vinuvicho.compshop.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Smartphone extends Computer {
    private Long cameraMP;

    @Override
    public String displayInfo() {
        return "<h2>Smartphone " + this.getName() + "</h2>";
    }
}
