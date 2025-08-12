import java.util.*;
//https://codeforces.com/problemset/problem/96/A
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 1;
        int ct = 1;
        for(int i = 1 ; i< s.length(); i++){
            if(s.charAt(i)== s.charAt(i-1)){
                ct++;
                max = Math.max(max, ct);
            }else{
                ct=1;
            }
        }
        if(max>=7){
            System.out.println("YES");
        }else{
             System.out.println("NO");
        }
        
    }
}
