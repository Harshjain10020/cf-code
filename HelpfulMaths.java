import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                arr.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        
        Collections.sort(arr);
        
        String res = "";
        for(int i = 0; i < arr.size(); i++){
            res += arr.get(i);
            if(i < arr.size() - 1){
                res += "+";
            }
        }
        
        System.out.println(res);
        sc.close();
    }
}
