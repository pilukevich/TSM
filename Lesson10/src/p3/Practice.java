package p3;

public class Practice {
    public static void main(String[] args) {
        String s3 = new String("qwerty");
        ///////////SB////////////
        StringBuilder sb = new StringBuilder();
        sb = new StringBuilder(10);
        sb = new StringBuilder("asdas");
        sb = new StringBuilder(s3);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.toString());
        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(23).toString();

        StringBuilder stringBuilder = new StringBuilder();
        String s = stringBuilder
                .append(23)
                .append('e')
                .append(method24444())
                .toString();
        System.out.println(s);


        char[] chars = new char[4];
        sb.getChars(0, 4, chars, 0);
        System.out.println(chars);
        sb.append("asdasd").append(12);
        System.out.println(sb);
        sb.insert(1, "!!!");
        System.out.println(sb);
        sb.delete(1, 4);
        System.out.println(sb);
        System.out.println(sb.reverse());

        sb.setLength(52313123);
        System.out.println(sb);
        sb = new StringBuilder("one two three");
        sb.replace(4, 7, "fouasdasdsdar");
        System.out.println(sb);
    }

    private static String method24444() {
        return "asd";
    }
}
