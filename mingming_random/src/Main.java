import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[501];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x] = 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(i);
            }
        }
    }
}