package homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Light extends LandTransport {//легковой
    private String bodyType; //Тип кузова
    private int countPassengers;//Кол-во пассажиров
}