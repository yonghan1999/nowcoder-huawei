import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        for (int i = 0; i < line1.length(); i++) {
            char c = line1.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'Z') {
                    buffer1.append('a');
                } else if (c == 'z') {
                    buffer1.append('A');
                } else {
                    c = (char) (c + 1);
                    if(Character.isLowerCase(c)) {
                        c = Character.toUpperCase(c);
                    }
                    else {
                        c = Character.toLowerCase(c);
                    }
                    buffer1.append(c);
                }
            }
            if (Character.isDigit(c)) {
                if (c == '9') {
                    buffer1.append('0');
                } else {
                    c = (char) (c + 1);
                    buffer1.append(c);
                }
            }
        }
        for (int i = 0; i < line2.length(); i++) {
            char c = line2.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'A') {
                    buffer2.append('z');
                } else if (c == 'a') {
                    buffer2.append('Z');
                } else {
                    c = (char) (c - 1);
                    if(Character.isLowerCase(c)) {
                        c = Character.toUpperCase(c);
                    }
                    else {
                        c = Character.toLowerCase(c);
                    }
                    buffer2.append(c);
                }
            }
            if (Character.isDigit(c)) {
                if (c == '0') {
                    buffer2.append('9');
                } else {
                    c = (char) (c - 1);
                    buffer2.append(c);
                }
            }
        }
        System.out.println(buffer1);
        System.out.println(buffer2);
    }
}