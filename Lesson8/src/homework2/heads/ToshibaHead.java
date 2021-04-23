package homework2.heads;

import homework2.abs.RobotParts;

public class ToshibaHead extends RobotParts implements IHead {

    public ToshibaHead(int price) {
        super(price);
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}