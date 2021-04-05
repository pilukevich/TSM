import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
//        System.out.println(sum(100, 200));
//        System.out.println(sum3(-5, Integer.MAX_VALUE));
//        System.out.println(sum(Integer.MIN_VALUE, Integer.MIN_VALUE));
//        System.out.println(max(56, 349));
//        int[] ar = null;
//        ar = new int[0];
//
//        System.out.println(average(new int[]{0, -2, 3, -1, 6}));
//        System.out.println(average(null));
//        System.out.println(average(new int[0]));
//        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(max(new int[]{-1,0,-4,-5}));
//        System.out.println(calculateHypotenuse(31, 4));

//        max(2, 2);

    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        long sum = a + (long) b;
        if (sum > Integer.MAX_VALUE) {
            return -1;
        }
//        System.out.println(Integer.sum(a,b));
        return a + b;
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
//        return Math.max(a, b);
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        if (array != null && array.length > 0) {
            double sum = 0;
            for (int j : array) {
                sum += j;
            }
            return sum / array.length;
        }
        return 0;
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
//        int max = Integer.MIN_VALUE;
//        for (int element : array) {
//            if (element > max) {
//                max = element;
//            }
//        }
//        return max;
        if (array != null) {
            return Arrays.stream(array)
                    .max()
                    .orElse(0);
        } else {
            return 0;
        }
    }


    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
//        return Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
//        return Math.sqrt(a * a + b * b);
        return Math.hypot(a, b);
    }
}