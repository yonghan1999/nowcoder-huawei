import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int index = Integer.parseInt(sc.nextLine());
        TreeMap<String,Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        while (index-- > 0) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            if (map.containsKey(arr[0])) {
                map.put(arr[0],map.get(arr[0]) + Integer.parseInt(arr[1]));
            }
            else {
                map.put(arr[0],Integer.parseInt(arr[1]));
            }
        }
        map.forEach((s, integer) -> {
            System.out.println(s + " " + integer);
        });
    }
}