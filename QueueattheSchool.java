import java.util.*;
//https://codeforces.com/problemset/problem/266/B
public class QueueattheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        char[] queue = s.toCharArray();
        
        for(int time = 0; time < t; time++) {
            for(int i = 0; i < n - 1; i++) {
                if(queue[i] == 'B' && queue[i + 1] == 'G') {
                    // Swap B and G
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i++; 
                }
            }
        }
        
        System.out.println(new String(queue));
        sc.close();
    }
}
