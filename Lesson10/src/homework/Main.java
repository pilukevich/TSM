package homework;

public class Main {
    public static void main(String[] args) {
        String str = "carbarcarbcar";//arbarcarb
        System.out.println(str.substring(str.indexOf("a"), str.lastIndexOf("b")));
        str = "AA1234";
        System.out.println(str.substring(0, 2));//ar //AA1234

        char a = str.charAt(0);
        char b = str.charAt(3);
        System.out.println(str.replace(a, b));

        String str2 = "Алла";
        String strReverse = new StringBuilder(str2).reverse().toString();
        if (str2.equalsIgnoreCase(strReverse)) {
            System.out.println(str2 + " является полиндром");
        } else {
            System.out.println(str2 + " не является полиндром");
        }
    }
}
