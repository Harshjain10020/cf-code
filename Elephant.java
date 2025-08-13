import java.util.*;
//https://codeforces.com/problemset/problem/617/A

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
        int ct = 0;
        while (dis>0) {
            if(dis>=5){
                dis = dis-5;
                ct++;
            }else{
                ct++;
                dis = 0;
            }
        }
        System.out.println(ct);

    }
}
