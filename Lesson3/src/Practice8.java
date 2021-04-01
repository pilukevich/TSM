import java.util.Arrays;

public class Practice8 {

    boolean[] array;

    /**
     * объявнение
     * https://metanit.com/java/tutorial/2.4.php
     **/
    public static void main(String[] args) {
        //поговорим про массивы
        boolean[] array = {true, false,true};

        new Practice8().calc(array.length);

    }

    private void calc(int size) {
        boolean[] array = new boolean[size];
        this.array = array;

    }


}
