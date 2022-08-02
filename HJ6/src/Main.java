import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer num = Integer.parseInt(br.readLine());

        if(rec(num)){
            System.out.print(num);
        }
    }
    public static boolean rec(Integer num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                System.out.print(i + " ");
                num /= i;
                if(rec(num)){
                    System.out.print(num);
                }
                return false;
            }
        }
        return true;
    }
}