package me.vinuvicho.compshop.entity.computer;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DesktopComputer extends Computer {

    private Long screen;
    private String memoryType;

    @Override
    public String displayInfo() {
        return null;
    }
}
