public class Homework1 {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        int count = 0;
        try {
            for (String arg : args) {
                int n = Integer.parseInt(arg);
                if (n > 0) {
                    count++;
                }
            }
            System.out.println("Kolichestvo polozhitelnyh chisel = " + count);
        } catch (Exception e) {
            System.out.println("Неверные входные данные");
        }
    }
}
