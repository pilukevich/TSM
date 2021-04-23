package homework2.legs;

import homework2.abs.RobotParts;

public class SamsungLeg extends RobotParts implements ILeg {

    public SamsungLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}