package p2;

public class Practice2 {
    public static void main(String[] args) {
        String s3 = new String("qwerty");
        String s4 = new String(new char[]{'s', 't', 'r', 'i', 'n', 'g'});

        s4 = "";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());
        s4 = "    ";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());
        s4 = "    f";
        System.out.println(s4.isBlank());

        s4 = null;
//        System.out.println(s4.isEmpty());//
        System.out.println(s4.isBlank());


        //проверка на null

    }
}
