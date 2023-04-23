class Solution {
    public double solution(int[] numbers) {
        double answer = 0;  // 반환값이 실수 이므로 답을 저장할 변수 answer를 double로 선언
        int sum = 0;    // 평균값을 구하기 위해 배열 인수의 총합을 저장할 정수 변수 sum을 덧셈 항등원으로 초기화
        
        for (int i = 0; i < numbers.length; i++) {  // 인덱스 통제를 위한 반복문 제어문 작성
            sum += numbers[i];                      // 인수의 총합을 복합대입연산자로 구함
        }
        
        answer = sum / (double)numbers.length;  // 총합을 double로 형변환한 numbers배열의 길이로 나눠줌
                                                // - 길이가 해당 배열의 인수의 개수와 같기때문에
        
        
        return answer;
    }
}