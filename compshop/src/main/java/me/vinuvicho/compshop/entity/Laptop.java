package me.vinuvicho.compshop.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
public class Laptop extends Computer {
    private Long screen;

    @Override
    public String displayInfo() {
        return null;
    }
}
