package homework2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Military extends AirTransport {//военный
    private boolean catapultSystem;//Наличие системы катапультирования
    private int countRockets;//Кол-во ракет на борту
}