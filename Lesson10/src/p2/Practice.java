package p2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * Строки - последовательность символов(сылочный тип данных)
 */
public class Practice {
    public static void main(String[] args) {
        String s1 = null;
        s1 = "string";
        System.out.println(s1);
        String s2 = new String();//что тут будет на консоли?
        System.out.println(s2.toString());
        String s3 = new String("qwerty");
        System.out.println(s3);


        String s4 = new String(new char[]{'s', 't', 'r', 'i', 'n', 'g'});
        String s5 = new String(new byte[]{-48, -80, -48, -79, -47, -122});//абц

        System.out.println(s5);
        System.out.println(s4);
        System.out.println(s4.length());
        System.out.println("абц".length());

        byte[] bytes = s1.getBytes();
        System.out.println(new String(bytes));

        //более не прозрачная передача данных(пароль пользователя)
        System.out.println(Arrays.toString("абц".getBytes(StandardCharsets.UTF_8)));

        //не изменяемость(immutable объект)
        s4 = s5;
        System.out.println(s4);
        System.out.println(s5);


        s5 = s5.replace("ц", "f");
        System.out.println(s5);
        System.out.println(s4);//зачем надо делать так что бы нельзя было поменять?
        //ключ - значение

        //пул строк
        System.out.println("at");
        System.out.println("asd" == "asd");//false -
        String asd = new String("asd".getBytes());
        System.out.println("asd" == asd);//false
        System.out.println("asd".equals(asd));//true
        String intern = asd.intern();
        System.out.println("asd".intern() == intern);//false -


    }

}
