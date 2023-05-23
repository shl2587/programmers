import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // scanner클래스를 통해 값을 입력받고
        int n = sc.nextInt();   // 정수 n에 값을 입력받고
        
        if (n % 2 == 0) {   // n이 짝수이면
            System.out.println(n + " is even"); // is even을 출력
        }
        else {  // 홀수이면
            System.out.println(n + " is odd");  // is odd를 출력
        }
    }
}