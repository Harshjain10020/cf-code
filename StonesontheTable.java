import java.util.*;

public class StonesontheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int ct = 0;
        for(int i = 1 ; i< s.length() ; i++){
            if(s.charAt(i)== s.charAt(i-1)){
                ct++;
            }
        }
        System.out.println(ct);
    }

}
