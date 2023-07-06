class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String num1 = "";
        String num2 = "";
        int number1;
        int number2;
        
        for(int i = 0; i < binomial.length(); i++) {
            // 문자열 tmp 변수에 binomial의 i번째 문자열을 계속 저장
            String tmp = String.valueOf(binomial.charAt(i));
            if(tmp.equals("+")) {   // tmp가 "+"이면
                // num1문자열 변수에 " +"이전까지 문자열을 저장
                num1 = binomial.substring(0, binomial.indexOf("+") - 1);
                // num2문자열 변수에 "+ "이후부터 문자열을 저장
                num2 = binomial.substring(binomial.indexOf("+") + 2);
                // num1과 num2의 문자열을 정수로 변환하여 number1과 number2에 각각 저장
                number1 = Integer.parseInt(num1);
                number2 = Integer.parseInt(num2);
                // answer에 두 정수를 더한 값을 저장하고
                answer = number1 + number2;
                // 반복 중단
                break;
            }
            if(tmp.equals("-")) {   // tmp가 "-"이면
                // num1문자열 변수에 " -"이전까지 문자열을 저장
                num1 = binomial.substring(0, binomial.indexOf("-") - 1);
                // num2문자열 변수에 "- "이후부터 문자열을 저장
                num2 = binomial.substring(binomial.indexOf("-") + 2);
                // num1과 num2의 문자열을 정수로 변환하여 number1과 number2에 각각 저장
                number1 = Integer.parseInt(num1);
                number2 = Integer.parseInt(num2);
                // answer에 두 정수를 뺀 값을 저장하고
                answer = number1 - number2;
                // 반복 중단
                break;
            }
            if(tmp.equals("*")) {   // tmp가 "*"이면
                // num1문자열 변수에 " *"이전까지 문자열을 저장
                num1 = binomial.substring(0, binomial.indexOf("*") - 1);
                // num1문자열 변수에 "* "이후부터 문자열을 저장
                num2 = binomial.substring(binomial.indexOf("*") + 2);
                // num1과 num2의 문자열을 정수로 변환하여 number1과 number2에 각각 저장
                number1 = Integer.parseInt(num1);
                number2 = Integer.parseInt(num2);
                // answer에 두 정수를 곱한 값을 저장하고
                answer = number1 * number2;
                // 반복 중단
                break;
            }
        }
        
        
        
        return answer;
    }
}