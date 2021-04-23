package p1;

import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;

@Getter
@Setter
public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }

    public void putCollar() {
        System.out.println("Ошейник надет");
        isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("Поводок надет");
        isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("Намордник надет");
        isMuzzlePutOn = true;
    }

    int walk() throws FileNotFoundException {
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
            System.out.println("вышли на улицу");
        } else {
            try {
                //System.exit(0);
                return 5 / 0;
            } catch (Exception exaption) {
                throw new FileNotFoundException("file not fund");
            } finally {
                System.out.println("finally");
                //throw new Exception("Exception");
            }
        }
        return 2;
    }

    public void walk2() throws Exception {
        throw new Exception();
    }
}
