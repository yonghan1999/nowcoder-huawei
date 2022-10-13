import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] arr = input.split(" ");
        String x = arr[arr.length - 2];
        HashMap<Character, Integer> map = new HashMap<>();
        getWorkMap(x, map);
        List<String> res = new ArrayList<>();
        int k = Integer.parseInt(arr[arr.length - 1]);
        int n = Integer.parseInt(arr[0]);
        for (int i = 1; i <= n; i++) {
            String t = arr[i];
            if (t.length() != x.length() || t.equals(x)) {
                continue;
            }
            boolean flag = true;
            HashMap<Character, Integer> tmpMap = new HashMap<Character, Integer>();
            getWorkMap(t, tmpMap);
            for (Character c : tmpMap.keySet()) {
                if (tmpMap.get(c).equals(0)) {
                    continue;
                }
                else if (!map.containsKey(c)) {
                    flag = false;
                    break;
                }
                else if (!map.get(c).equals(tmpMap.get(c))) {
                    flag = false;
                    break;
                }
                tmpMap.put(c, 0);
            }
            tmpMap.values().removeIf(value -> value.equals(0));

            if (flag && tmpMap.size() == 0) {
                res.add(t);
            }
        }
        res.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(res.size());
        if (k -1 < res.size()) {
            System.out.println(res.get(k - 1));
        }

    }

    private static void getWorkMap(String x, HashMap<Character, Integer> tmpMap) {
        for (int j = 0; j < x.length(); j++) {
            if (tmpMap.containsKey(x.charAt(j))) {
                tmpMap.put(x.charAt(j), 1 + tmpMap.get(x.charAt(j)));
            } else {
                tmpMap.put(x.charAt(j), 1);
            }
        }
    }
}