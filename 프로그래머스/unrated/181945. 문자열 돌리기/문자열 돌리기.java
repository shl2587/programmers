import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {  // 해당 문자열의 길이만큼 반복회수 제어
            System.out.println(a.charAt(i));    // 문자열을 전부 println으로 각각 출력
        }
    }
}