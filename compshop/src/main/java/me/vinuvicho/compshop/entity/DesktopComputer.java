package me.vinuvicho.compshop.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class DesktopComputer extends Computer {

    private Long screen;

    @Override
    public String displayInfo() {
        return null;
    }
}
