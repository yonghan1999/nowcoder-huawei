import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        String c = br.readLine();
        firstLine = firstLine.toUpperCase();
        c = c.toUpperCase();
        int sum = 0;
        for (int i = 0; i < firstLine.length(); i++) {
            if (firstLine.substring(i,i+1).equals(c)) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
}