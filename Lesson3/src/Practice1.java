import static sun.misc.Version.print;

public class Practice1 {
    /**
     * объявнение
     * Нередки ситуации, когда приходится применять различные операции, например,
     * сложение и произведение, над значениями разных типов. Здесь также действуют некоторые правила:
     * <p>
     * 1) если один double, то и второй будет double
     * <p>
     * 2) если один float, то и второй будет float (если 1 условие не соблюдено)
     * <p>
     * 3) если один long, то и второй будет long (если 1 и 2 условие не соблюдены)
     * <p>
     * 4) иначе все операнды операции преобразуются к типу int
     **/
    public static void main(String[] args) {
        myPrint(1 + 1f);//float
        myPrint(2L + 1f);//float
        myPrint(3 + 1L);//long
        myPrint(4f + 1.0);//double
        myPrint((byte) 1 + 5);//int
        myPrint((byte) 5 + 13L);//long
        myPrint((byte) 2 + (short) 5);//int
        myPrint(5.5 + (int) 3);//double
        myPrint((char) 'a' + 5);//int
        System.out.println((char) 'a');
    }

    private static void myPrint(float value) {
        System.out.println(value + " пренадлежит к типу float");
    }

    private static void myPrint(int value) {
        System.out.println(value + " пренадлежит к типу int");
    }

    private static void myPrint(long value) {
        System.out.println(value + " пренадлежит к типу long");
    }

    private static void myPrint(double value) {
        System.out.println(value + " пренадлежит к типу double");
    }

}
