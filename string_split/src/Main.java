import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < line.length(); i++) {
            buffer.append(line.charAt(i));
            if (buffer.length() == 8) {
                System.out.println(buffer.toString());
                buffer.setLength(0);
            }
        }
        if (buffer.length() != 0) {
            while(buffer.length() < 8) {
                buffer.append('0');
            }
            System.out.println(buffer.toString());
        }
    }
}