//https://codeforces.com/problemset/problem/791/A
import java.util.*;

public class BearandBigBrother {
    public static void main(String[] args) {
        // Your code logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ct = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            ct++;
        }
        System.out.println(ct);
        sc.close();
    }
}
