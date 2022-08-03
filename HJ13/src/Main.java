import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String[] arr = str.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = arr.length - 1 ; i >= 0; i--) {
            buffer.append(arr[i]);
            if (i != 0) {
                buffer.append(" ");
            }
        }
        System.out.println(buffer);
    }
}