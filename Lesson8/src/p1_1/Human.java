package p1_1;

import lombok.Getter;

/**
 * Абстрактные классы!
 */
@Getter
public abstract class Human {

    public void info() {
        System.out.println("Info " + getName());
    }

    abstract String getName();
}
