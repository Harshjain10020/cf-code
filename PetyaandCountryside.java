//import java.util.*;
//https://codeforces.com/problemset/problem/66/B
// public class PetyaandCountryside {
//  public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     int max = -1;
//     for (int i = 0; i < arr.length; i++) {
//         arr[i] = sc.nextInt();
//         max = Math.max(max, arr[i]);
//     }
//     int ct = 1;
//     int idx = 0;
//     for(int i = 0; i< arr.length ; i++){
//         if(arr[i]== max){
//             idx = i;
//         }
//     }

//     //right
//     for(int i = idx ; i< arr.length; i++){
//         if(arr[i]<=max){
//             ct++;
//         }
//     }
//     //right
//     for(int i = idx-1 ; i>=0; i--){
//         if(arr[i]<=max){
//             ct++;
//         }
//     }
//     System.out.println(ct);
    

//  }   
// }
import java.util.Scanner;

public class PetyaandCountryside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int maxWatered = 0;
        for (int i = 0; i < n; i++) {
            int count = 1;
            // Spread to the left
            int left = i - 1;
            while (left >= 0 && h[left] <= h[left + 1]) {
                count++;
                left--;
            }
            // Spread to the right
            int right = i + 1;
            while (right < n && h[right] <= h[right - 1]) {
                count++;
                right++;
            }
            maxWatered = Math.max(maxWatered, count);
        }
        System.out.println(maxWatered);
    }
}