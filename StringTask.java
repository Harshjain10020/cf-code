import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String vowels = "aeiouAEIOUyY";
        String res = "";
        
        for(char ch : s.toCharArray()){
            if(vowels.contains(Character.toString(ch))){
                continue; // Skip vowels
            }else{
                res += ".";
                res += Character.toLowerCase(ch);
            }
        }
        System.out.println(res);
        sc.close();
    }
}
