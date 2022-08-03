import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        StringBuffer buffer = new StringBuffer();
        for (int i = str.length()-1; i >= 0 ; i--) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                buffer.append(c);
            }
        }
        System.out.println(buffer);
    }
}