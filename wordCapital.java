import java.util.*;
//https://codeforces.com/problemset/problem/281/A
public class wordCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
       
        String result = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        
        System.out.println(result);
        sc.close();
    }
}
