//https://codeforces.com/problemset/problem/110/A
import java.util.*;
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 0;
        for (char ch : n.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }
       
        if (count > 0 && isLucky(count)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }


    private static boolean isLucky(int num) {
        String s = String.valueOf(num);
        for (char ch : s.toCharArray()) {
            if (ch != '4' && ch != '7') {
                return false;
            }
        }
        return true;
    }
}
