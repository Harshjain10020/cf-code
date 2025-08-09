import java.util.*;
public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> arr = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(!arr.contains(ch)){
                arr.add(ch);
            }
        }
        if(arr.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
