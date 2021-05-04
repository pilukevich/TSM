package homework;

import com.tms.io.output.TmsFileWriter;
import com.tms.io.output.TmsWriter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        TmsWriter writer = new TmsFileWriter("Lesson11/resources/hw1_out.txt");
        writer.append(sb.reverse().toString());
    }
}