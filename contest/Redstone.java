import java.util.*;

public class Redstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }
            
            boolean yes = false;
            for (int count : freq.values()) {
                if (count >= 2) {
                    yes = true;
                    break;
                }
            }
            System.out.println(yes ? "YES" : "NO");
        }
    }
}
