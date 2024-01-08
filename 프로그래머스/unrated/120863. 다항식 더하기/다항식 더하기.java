import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replace(" ", "");
        polynomial = polynomial.replace("+", " ");
        String[] polynomialArr = polynomial.split(" ");
        int x = 0;
        int numSum = 0;
        for (String str : polynomialArr) {
            if (!"x".equals(str)) {
                if (str.contains("x")) {
                    x += Integer.parseInt(str.substring(0, str.indexOf("x")));
                }
                else {
                    numSum += Integer.parseInt(str);
                }
            }
            else {
                x++;
            }
        }
        
        if (x == 1) {
            if (numSum != 0) {
                String operator = " + ";
                answer = "x" + operator + String.valueOf(numSum);
            }
            else {
                answer = "x";
            }
        }
        else if (x == 0) {
            answer = String.valueOf(numSum);
        }
        else {
            if (numSum != 0) {
                String operator = " + ";
                answer = String.valueOf(x) + "x" + operator + String.valueOf(numSum);
            }
            else {
                answer = String.valueOf(x) + "x";
            }
        }
        
        
        return answer;
    }
}