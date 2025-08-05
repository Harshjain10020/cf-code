import java.util.*;


public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        for(int i = 0 ; i< n ; i++){
            String st = sc.nextLine();
            if(st.equals("X++") || st.equals("++X")){
                x++;
            }else if(st.equals("--X") || st.equals("X--")){
                x--;
            }
        }
        System.out.println(x);
    }
}
