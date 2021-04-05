public class Practice3 {
    public static void main(String[] args) {
        //операторы перехода
        //break; continue; return

//        return прекращает действие не зависимо от того в цикле или в методе
        if (true) {
            System.out.println("true");
            return;
        }

        System.out.println("123");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("sd");
            }
            return;
        }

        String str = smth();
        System.out.println(str + " 11111");


        //continue много вложеностей по коду
        //работает только в циклах
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        for (int j = 0; j < 2; j++) {
            System.out.println("j: "+j);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }


//        Задача: вывести все элементы массива которые больше 3
        int[] mass = new int[]{1, 2, 3, 4, 2};

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 3) {
                continue;
            }
            System.out.println(mass[i]);
        }



        //---------------------------------------------------------------------------
        //break
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 3) {
                break;
            }
            System.out.println(mass[i]);

        }

//        задача с брейком

        calculation();
        System.out.println("Done!");
    }

    private static void calculation() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 5) {
                    System.out.println("ALARM");
                    return;
                }
                System.out.println(i + " " + j);
            }
        }
    }

    public static String smth() {
        System.out.println("start");
        if (false) {
            return "1";
        } else {
            System.out.println("end");
            return null;
        }
    }
}
