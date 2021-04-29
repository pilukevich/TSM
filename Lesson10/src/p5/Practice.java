package p5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

    private final static Pattern pattern = Pattern.compile("(\\d+)([a-z]+)(\\d+)");

    public static void main(String[] args) {

        Matcher matcher = pattern.matcher("111abasda222onetwothree");

        System.out.println(matcher.matches());//на всю строку

        System.out.println(matcher.find());
        System.out.println(matcher.start() + " " + matcher.end());


        System.out.println(matcher.group(1));
        System.out.println(matcher.group(2));
        System.out.println(matcher.group(3));

        System.out.println(matcher.replaceAll("_WILDCARD_$2$3"));
        System.out.println(matcher.find());


        System.out.println(new String("2342343").matches("\\d"));
        System.out.println(Arrays.toString("sdf2342343sdf333hhh".split("\\d+")));
    }
}
