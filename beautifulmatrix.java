import java.util.*;
public class beautifulmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        int a = 0;
        int b = 0;
        for(int i = 0 ; i< 5 ; i++){
            for(int j = 0 ; j< 5 ; j++){
                m[i][j] = sc.nextInt();
                if(m[i][j] == 1){
                    a = i;
                    b = j;
                }
            }
        }
        int step = 0;
        if(a== 2 && b == 2){
            step = 0;
        }else{
            step += Math.abs(a-2);
            step += Math.abs(b-2);
        }
        System.out.println(step);
    }
}
