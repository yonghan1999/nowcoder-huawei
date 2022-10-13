import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            if (n == 0) {
                return;
            }
            int x = 0;
            while (n > 2) {
                int t = n / 3;
                n = n % 3;
                x += t;
                n += t;
            }
            if (n == 2) {
                x += 1;
            }
            System.out.println(x);
        }
    }
}