import java.util.Scanner;

public class Practice1 {
    /**
     * https://overcoder.net/q/190300/в-чем-разница-между-циклом-i-и-i-для-java
     * @param args
     */
    public static void main(String[] args) {
        int[] mass = new int[3];
        //Данные конструкции эквивалентны
        for (int i = 0; i < mass.length; i++) {
            System.out.println("1");
        }
        for (int i = 0; i < mass.length; ++i) {
            System.out.println("1");
        }
        //Поговорим про for
//        for ([инициализация]; [логическое выражение]; [обновление]){
//            //тело цикла
//        }

        for (int i = 0; i < 10; i++) {//i -=2  что будет?
            System.out.print(i + " ");
        }

        System.out.println();
        //бесконечный цикл и выход из него
        int pp = 0;
        for (;;) {
            System.out.print(pp+" ");
            if (pp++ >= 10) {
                break;
            }
        }

        //2 переменные в for
        for (int j = 0, k = 10; j < k; j++, k--) {
            System.out.println(j + " " + k);
        }
//------------------------------------------------------------------------------------------
//        Задача: используюя for вывести от 0 до 100 которые делятся нацело на 5 (оптимальное обновление нужно)
        for (int ii = 0; ii <= 100; ii+=5) {
            System.out.print(ii +" ");
        }



        //while (логическое выражение) //упрощенная версия for
        int l = 0;
        while (l <= 100) { //если условие false то не будет ни одной итерации
            System.out.println(l++);
        }

        boolean flag = true;
        int kk = 0;
        while (flag) {
            if (kk > 10) {
                flag = false;
            }
            kk++;
        }

//---------------------------------------------------------------------------
//        do {
//
//        } while (логичесткое выражение)


        int s = 0;
        System.out.println("Добро пожаловать в кафе, что будете?");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("лате (нажми 1)");
            System.out.println("капучино (нажми 2)");
            System.out.println("выход (нажми 3)");
            s = scanner.nextInt();
            System.out.println("Спасибо за выбор");
            switch (s) {
                case 1:
                    System.out.println("Лате готово");
                    break;
                case 2:
                    System.out.println("Капучино готово");
                    break;
            }
            System.out.println("Что то еще?");
        } while (s != 3); //выйдет из цикла когда false
    }
}
