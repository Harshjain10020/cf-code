import java.util.*;

public class word{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String res = "";
        int up = 0;
        int low = 0;

        for(char ch : w.toCharArray()){
            if(Character.isUpperCase(ch)){
                up++;
            }else{
                low++;
            }
        }
        if(up>low){
           res= w.toUpperCase();
        }else if(up<low){
           res=  w.toLowerCase();
        }else{
           res= w.toLowerCase();
        }
        System.out.println(res);
        sc.close();
    }
}