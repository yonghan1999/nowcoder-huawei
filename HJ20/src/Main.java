import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            HashSet<String> set = new HashSet<String>();
            boolean num = false,up = false,low = false,s =false, valid = true;
            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) >= 48 && input.charAt(i) <= 57){
                    num = true;
                }
                else if(input.charAt(i) >= 65 && input.charAt(i) <= 90){
                    up = true;
                }
                else if(input.charAt(i) >= 97 && input.charAt(i) <= 122){
                    low = true;
                }
                else if(!s) {
                    s = true;
                }
                if(i+3 < input.length()) {
                    String subStr = input.substring(i, i+3);
                    if(set.contains(subStr)) {
                        valid = false;
                        break;
                    }
                    else {
                        set.add(subStr);
                    }
                }
                else {
                    String subStr = input.substring(i);
                    if(set.contains(subStr)) {
                        valid = false;
                        break;
                    }
                    else {
                        set.add(subStr);
                    }

                }
            }
            int count = 0;
            count += num ? 1 : 0;
            count += up ? 1 : 0;
            count += low ? 1 : 0;
            count += s ? 1 : 0;
            if(valid && count >= 3) {
                System.out.println("OK");
            }
            else {
                System.out.println("NG");
            }
        }
    }
}