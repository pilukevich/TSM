package p4;

import java.io.File;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

//+38(044)555-55-55

        String str = "Егор:Алла?Александр.";
        File file = new File("sadf.out");
        System.out.println(file.getAbsolutePath());

        System.out.println(Character.isWhitespace(' '));

        String[] split = str.split("\\W");
        System.out.println(Arrays.toString(split));
    }

    public static boolean method(String email) {

        return false;
    }

}
