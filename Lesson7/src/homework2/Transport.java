package homework2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
public class Transport implements Transportable {//базовый класс
    private double power; // Мощность(в лошадиных силах)
    private double maxSpeed; //Максимальная скорость(км/ч)
    private double weight; //Масса (кг)
    private String brand; //марка

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + getPower(power) +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}