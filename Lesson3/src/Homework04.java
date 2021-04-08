public class Homework04 {
    public static void main(String[] args) { //начинается работа майн
//        тут только вызваем методы или пишем логику
        calculation(); //вызов метод расчета а+b и вывода на консоль
    } //после этой скобки заканчивается работа метода майн

    //тут пишем уже метод calculation
    public static void calculation() { //начало метода
        int a = 2;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);
    } //после этой скобки заканчивается работа метода calculation

    //следующий метод next (нигде не вызвается). например можем вызвать в методе calculation(). Попробуйте.
    public static String next() {
        return "next";
    }
}
