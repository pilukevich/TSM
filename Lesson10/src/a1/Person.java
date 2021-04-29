package a1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Person implements Serializable, Cloneable, Runnable, MyRunnable {
    private String name;

    @Override
    public void run() {

    }

    @Override
    public void myRun() {

    }

    @Override
    public int hashCode() {
        return 12;
    }
}
