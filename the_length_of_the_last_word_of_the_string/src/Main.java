import java.util.Scanner;

public class Main{
    public  static void  main(String [] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        System.out.println(arr[arr.length - 1].length());
    }
}