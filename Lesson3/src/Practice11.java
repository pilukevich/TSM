import javafx.scene.control.RadioMenuItem;

import java.util.Arrays;
import java.util.Random;

public class Practice11 {
    public static void main(String[] args) {
        //поговорим про массивы
        int[] array = {100,200,36};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //Random позволяет забивать рандомные числа в массивы, переменные
        Random random = new Random();
        System.out.println(random.nextInt(100));// не включая 100

        //многомерные массивы
        int[][] nums2 = {
                {0, 1000, 2},
                {30, 4, 5}
        };

        // можно так вывести
        for (int[] ints : nums2) {
            System.out.println(Arrays.toString(ints));
        }

//        //printf для форматированного вывода
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2[i].length; j++) {
                System.out.printf("%5d", nums2[i][j]);
            }
            System.out.println();
        }
    }

}
