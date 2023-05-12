class Solution {
    public int solution(int[] num_list) {
        int answer; // 정담을 담을 정수 변수 선언
        String even_num = "", odd_num = ""; // 짝수와 홀수의 문자열을 담을 문자열 변수 선언 및 빈문자열로 초기화
        
        for(int i = 0; i < num_list.length; i++) {  // num_list의 길이만큼 반복회수 설정
            if (num_list[i] % 2 == 0) { // i번재 요소가 2로 나누어 나머지가 없으면
                even_num += String.valueOf(num_list[i]);    // 짝수변수에 문자열로 누적 합산 실행
            }
            else {  // 나머지가 발생하면
                odd_num += String.valueOf(num_list[i]); // 홀수 변수에 문자열로 누적 합산 진행
            }
        }
        // 짝수 문자열과 홀수 문자열을 정수로 변환시켜 합산하여 answer 변수에 저장
        answer = Integer.parseInt(even_num) + Integer.parseInt(odd_num);   
        return answer;
    }
}