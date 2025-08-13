import java.util.*;
//https://codeforces.com/problemset/problem/546/A
public class SoldierandBananas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        
       
        long totalCost = (long) k * w * (w + 1) / 2;
        
       
        long borrow = totalCost - n;
        
        
        System.out.println(Math.max(0, borrow));
        
        sc.close();
    }
}