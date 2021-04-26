package p1;

import java.io.IOException;

public class Practice3 {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    private static void method() throws IOException {
        throw new IOException();
    }
}
