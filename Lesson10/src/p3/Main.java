package p3;

public class Main {
    public static void main(String[] args) {
        String str = "carbar";
//        System.out.println(str.replaceAll("a+", "!"));
//        new StringBuilder(32)
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(0, 2, "fouasdasdsdar");
        System.out.println(stringBuilder.length());
        stringBuilder.setLength(52313123);
        stringBuilder.append(12233);


//        String substring = stringBuilder.substring(3);
//        System.out.println(substring.length());

    }
}
