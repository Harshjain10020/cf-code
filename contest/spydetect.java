import java.util.*;
public class spydetect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }
            for(int i = 0; i < n; i++){
                if(freq.get(arr[i]) == 1){
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        sc.close();
    }
}
