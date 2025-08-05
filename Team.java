// //A. Team
// https://codeforces.com/problemset/problem/231/A?csrf_token=d0cdbda46e0aff597d66b20ea9d48c17
import java.util.*;

public class Team {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];

        for(int i = 0 ; i< n; i++){
            for(int j = 0 ; j< 3 ; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int ct = 0;
        int res = 0;
        for(int i = 0 ; i< n; i++){
            for(int j = 0 ; j< 3 ; j++){
                if(arr[i][j]==1){
                    ct++;
                }
                
            }
            if(ct>=2){
                res++;
            }
            ct=0;
        }
        System.out.println(res);


}
    
}