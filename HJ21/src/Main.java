import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '0') {
                buffer.append("0");
            } else if (c == '1') {
                buffer.append("1");
            } else if (c == 'a' || c == 'b' || c == 'c') {
                buffer.append("2");
            } else if (c == 'd' || c == 'e' || c == 'f') {
                buffer.append("3");
            } else if (c == 'g' || c == 'h' || c == 'i') {
                buffer.append("4");
            } else if (c == 'j' || c == 'k' || c == 'l') {
                buffer.append("5");
            } else if (c == 'm' || c == 'n' || c == 'o') {
                buffer.append("6");
            } else if (c == 'p' || c == 'q' || c == 'r' || c == 's') {
                buffer.append("7");
            } else if (c == 't' || c == 'u' || c == 'v') {
                buffer.append("8");
            } else if (c == 'w' || c == 'x' || c == 'y' || c == 'z') {
                buffer.append("9");
            } else if (c >= 65 && c <= 90) {
                char t;
                if (c == 90) {
                    t = 65;
                } else {
                    t = (char) (c + 1);
                }
                String s = "" + t;
                s = s.toLowerCase();
                buffer.append(s);
            } else {
                buffer.append(c);
            }
        }
        System.out.println(buffer);
    }
}