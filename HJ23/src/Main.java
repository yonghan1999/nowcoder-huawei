import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c, 1);
            }
        }
        int n = 100;

        for (Character key : map.keySet() ) {
            int count = map.get(key);
            if (count < n) {
                n = count;
            }
        }
        int finalN = n;
        map.values().removeIf(value -> value > finalN);
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char t = input.charAt(i);
            if (map.containsKey(t)) {
                continue;
            }
            else {
                buffer.append(t);
            }
        }
        System.out.println(buffer);
    }
}