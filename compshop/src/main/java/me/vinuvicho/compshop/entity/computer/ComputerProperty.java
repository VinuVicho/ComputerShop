package me.vinuvicho.compshop.entity.computer;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ComputerProperty {
    @SequenceGenerator(name = "property_sequence", sequenceName = "property_sequence", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "property_sequence")
    private Integer propertyId;
    private String propertyType;
    private String propertyDetails;
    private Double propertyPrice;

    public ComputerProperty(String propertyType, String propertyDetails, Double propertyPrice) {
        this.propertyType = propertyType;
        this.propertyDetails = propertyDetails;
        this.propertyPrice = propertyPrice;
    }

    public String displayInfo() {
        return "<tr><td>" + propertyType + "</td><td>" + propertyDetails + "</td><td>" +
                (propertyPrice == 0 ? "-" : "$" + propertyPrice) + "</td></tr>";
    }
}
