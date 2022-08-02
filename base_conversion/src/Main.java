import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        int d = 1;
        for (int i = str.length() - 1; i > 1; i--) {
            char c = str.charAt(i);
            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                    sum += (c - 65 + 10) * d;
                    break;
                default:
                    sum += (c - 48) * d;
                    break;
            }
            d*=16;
        }
        System.out.println(sum);
        br.close();
    }
}