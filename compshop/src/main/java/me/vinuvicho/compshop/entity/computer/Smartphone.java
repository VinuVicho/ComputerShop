package me.vinuvicho.compshop.entity.computer;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Smartphone extends Computer {
    private Long cameraMP;
    private Long frontCameraMP;

    @Override
    public String displayInfo() {
        return "<h2>Smartphone " + getName() + "</h2>" + super.displayInfo();
    }
}
