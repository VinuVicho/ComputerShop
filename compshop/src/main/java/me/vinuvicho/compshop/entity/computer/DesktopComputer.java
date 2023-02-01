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
public class DesktopComputer extends Computer {

    @ManyToOne(cascade = CascadeType.ALL)
    private ComputerProperty graphicCard;
    @ManyToOne(cascade = CascadeType.ALL)
    private ComputerProperty motherboard;

    public DesktopComputer(String name, String info, Double computerPrice, Integer stock) {
        super(name, info, computerPrice, stock);
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + graphicCard.displayInfo() + motherboard.displayInfo();
    }

    @Override
    public String displayName() {
        return "Desktop computer " + getName();
    }
}
