//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        int a = ((int) (Math.random() * 7)) + 5;
//        System.out.println(a);
//        System.out.println("Введите " + a + "целых чисел:");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int count = 0;
//        for (int i = 0; i < args.length; i++) {
//            String inputLine = reader.readLine();
//            if (Integer.parseInt(inputLine) > 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
