import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringBuffer buffer = new StringBuffer();
        for (int i = str.length() - 1 ; i >= 0; i--) {
            buffer.append(str.charAt(i));
        }
        System.out.println(buffer);
    }
}