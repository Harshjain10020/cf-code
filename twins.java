import java.util.*;
//https://codeforces.com/problemset/problem/160/A
public class twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        
        
        Arrays.sort(arr);
        for(int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        
        int totalSum = 0;
        for(int coin : arr) {
            totalSum += coin;
        }
        
        int mySum = 0;
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            mySum += arr[i];
            count++;
            
            if(mySum > totalSum - mySum) {
                break;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
