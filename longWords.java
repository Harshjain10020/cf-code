import java.util.*;
public class longWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline after the integer

        String[] wordList = new String[n];
        for(int i = 0 ; i< n ; i++){
            wordList[i] = sc.nextLine();
        }

        for(int i = 0 ; i < n ; i++){
            if(wordList[i].length()<=10){
                System.out.println(wordList[i]);
            }else{
                String word = wordList[i];
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                int middleCount = word.length() - 2;
                String res = first + String.valueOf(middleCount) + last;
                System.out.println(res);
            }
        }
        sc.close();
    }
}
