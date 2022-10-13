import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j < arr.length - i -1; ) {
                int next = j+1;
                while (next < arr.length) {
                    if (Character.isLetter(arr[next])) {
                        break;
                    }
                    else {
                        next++;
                    }
                }
                if (next == arr.length) {
                    break;
                }
                if (Character.isLetter(arr[j]) && Character.toLowerCase(arr[j]) > Character.toLowerCase(arr[next])) {
                    char t = arr[j];
                    arr[j] = arr[next];
                    arr[next] = t;
                }
                j = next;
            }
        }
        System.out.println(arr);
    }
}