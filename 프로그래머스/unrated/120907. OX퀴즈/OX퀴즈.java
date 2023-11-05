class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        // answer의 인덱스롤 통제할 index 선언 및 0으로 초기화
        int index = 0;
        
        for (String str : quiz) {
            int num1 = 0;   // 첫번째 정수를 저장할 num1
            int num2 = 0;   // 두번째 정수를 저장할 num2
            int result = 0; // 두 수의 연산 결과를 비교할 result
            // 연산자를 기준으로 substring의 인덱스를 정할 idx1, idx2, idx3를 선언
            int idx1 = 0;   
            int idx2 = 0;
            int idx3 = str.indexOf(" =");   // idx3는 공통적이므로 " ="의 인덱스를 저장
            // "+"연산자가 포함되었을 경우
            if (str.contains("+")) {
                // idx1과 idx2를 "+" 기준으로 저장해주고
                idx1 = str.indexOf(" +");
                idx2 = str.indexOf("+ ");
                // num1은 처음부터 idx1까지
                num1 = Integer.parseInt(str.substring(0, idx1));
                // num2는 idx2 + 2부터 idx3까지
                num2 = Integer.parseInt(str.substring(idx2 + 2, idx3));
                // result는 idx3 + 3부터 끝까지
                result = Integer.parseInt(str.substring(idx3 + 3));
                // num1에서 num2를 더한값이 result이면
                if (num1 + num2 == result) {
                    // "O"를 저장
                    answer[index] = "O";
                }
                // num1에서 num2를 더한값이 result가 아니면
                else {
                    // "X"를 저장
                    answer[index] = "X";
                }
                // index를 1증가
                index++;
            }
            // "-"연산자로 계산될 경우
            else {  
                // idx1과 idx2를 "-" 기준으로 저장해주고
                idx1 = str.indexOf(" -");
                idx2 = str.indexOf("- ");
                // num1은 처음부터 idx1까지
                num1 = Integer.parseInt(str.substring(0, idx1));
                // num2는 idx2 + 2부터 idx3까지
                num2 = Integer.parseInt(str.substring(idx2 + 2, idx3));
                // result는 idx3 + 3부터 끝까지
                result = Integer.parseInt(str.substring(idx3 + 3));
                // num1에서 num2를 뺀값이 result이면
                if (num1 - num2 == result) {
                    // "O"를 저장
                    answer[index] = "O";
                }
                // result가 아니면
                else {
                    // "X"를 저장
                    answer[index] = "X";
                }
                // index를 1증가
                index++;
            }   
        }
        
        return answer;
    }
}