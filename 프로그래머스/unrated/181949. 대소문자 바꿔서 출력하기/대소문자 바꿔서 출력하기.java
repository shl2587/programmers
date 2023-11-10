import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String small_letter = "";
        char alpha = 'a';
        String answer = "";
        
        for (int i = 0; i < 26; i++) {
            small_letter += alpha;
            alpha++;
        }
        
        for (int i = 0; i < a.length(); i++) {
            String tmp = "";
            tmp += a.charAt(i);
            if (small_letter.contains(tmp)) {
                char small_tmp = a.charAt(i);
                small_tmp -= 32;
                answer += small_tmp;
            }
            if(!small_letter.contains(tmp)) {
                char big_tmp = a.charAt(i);
                big_tmp += 32;
                answer += big_tmp;
            }
        }
        
        System.out.println(answer);
    }
}