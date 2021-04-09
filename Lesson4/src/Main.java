public class Main {
    public static void main(String[] args) {
        boolean[] array2 = new boolean[3];
        array2[0] = true;
        for (Object j : array2) {
            if ((boolean) j) {
                System.out.println("значение равно " + j);
            } else {
                System.out.println("значение равно " + j);
            }
        }
    }
}
