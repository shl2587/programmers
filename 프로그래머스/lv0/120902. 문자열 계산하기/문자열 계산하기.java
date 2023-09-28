class Solution {
    public int solution(String my_string) {
        int answer = 0;
        // 연산식에 연산 기호가 몇개 있는지 파악하여 해당 계산식의 정수를 저장해주기 위한 배열의 크기를 정하기 위해 count 정수 선언 및 1로 초기화
        // - 1로 초기화 하는 이유는 계산식에서 정수는 연산자 보다 1많기 때문
        int count = 1;
        
        for (int i = 0; i <  my_string.length(); i++) {
            // '+'나 '-'가 있을때 마다
            if(my_string.charAt(i) == '+' || my_string.charAt(i) == '-') {
                // count를 증가
                count++;
            }
        }
        
        // count만큼 크기의 배열을 선언
        int[] number = new int[count];
        // number 배열의 인덱스를 통제할 index정수 변수 선언 및 0으로 초기화
        int index = 0;
        // strIdx는 substring의 문자열 인덱스를 저장해주기 위함
        int strIdx = 0;
        for (int i = 0; i <  my_string.length(); i++) {
            // 연산자가 있다면
            if(my_string.charAt(i) == '+' || my_string.charAt(i) == '-') {
                // 해당 연산자의 앞에 위치한 정수를 strNum에 저장하여
                String strNum = my_string.substring(strIdx, i-1);
                // number에 strNum을 정수로 변환하여  저장
                number[index] = Integer.parseInt(strNum);
                // strIdx를 해당 연산자의 인덱스 및 " "를 고려하여 +2를 하여 저장
                strIdx = i + 2;
                // number의 index를 증가
                index++;
                // index가 number의 길이의 -1과 일치하면 더이상의 연산자가 없다는 의미이므로
                if (index == number.length - 1) {
                    // strNumb에 마지막 정수를 저장하고
                    strNum = my_string.substring(strIdx);
                    // 정수로 변환하여 저장하고 반복문 종료
                    number[index] = Integer.parseInt(strNum);
                    break;
                }
            }
        }
        
        // number 배열을 통제하기 위해 index에 0을 저장
        index = 0;
        // answer에 첫 정수를 저장
        answer = number[index];
        // my_string을 반복하여
        for (int i = 0; i <  my_string.length(); i++) {
            // +연산자가 있다면
            if(my_string.charAt(i) == '+') {
                // answer에 number의 다음 숫자를 더해주고
                answer += number[++index];
            }
            // -연산자가 있다면
            else if (my_string.charAt(i) == '-') {
                // answer에 number의 다음 숫자를 뺄셈
                answer -= number[++index];
            }
        }
        
        return answer;
    }
}