package homework2.legs;

import homework2.abs.RobotParts;

public class SonyLeg extends RobotParts implements ILeg {

    public SonyLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Sony сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}