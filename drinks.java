import java.util.*;
//https://codeforces.com/problemset/problem/200/B
public class drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        sc.nextLine();
        for(int i = 0 ; i< n ; i++){
            sum+=sc.nextInt();
        }
        float res = (float) sum/n;
        System.out.println(res);
    }
}
