package homework2.hands;

import homework2.abs.RobotParts;

public class ToshibaHand extends RobotParts implements IHand {

    public ToshibaHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука с логотипом Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}