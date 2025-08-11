import java.util.*;

public class translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int n = t.length();
        String re = "";
        for(int i = n - 1 ; i >= 0 ; i--){
            re += t.charAt(i);
        }
        if(re.equals(s)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
