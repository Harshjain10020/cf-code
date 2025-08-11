import java.util.*;
//https://codeforces.com/problemset/problem/734/A

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int a = 0;
        int d = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'A'){
                a++;
            }else{
                d++;
            }
        }

        if(a>d){
            System.out.println("Anton");
        }else if(a<d){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }
}
