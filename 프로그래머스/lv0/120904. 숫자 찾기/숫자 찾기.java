class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String tmp = "";    // 자리수 비교를 위해 해당 수를 저장할
                            // tmp 문자열 선언 및 빈문자열로 초기화
        // number 문자열에 num을 문자열로 치환하여 저장
        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            tmp += number.charAt(i);    // tmp에 각자리를 저장해주고
            answer++;   // answer를 1씩 증가
            // tmp를 정수로 치환하여 k와 같은지 비교하고
            if (Integer.parseInt(tmp) == k) {   // 같으면
                break;  // 반복문 종료
            }
            // answer이 number의 길이와 같다면
            else if (answer == number.length()) {
                // 중복되는 수가 없다는 의미이므로
                answer = -1;    // answer에 -1을 저장
                
            }
            tmp = "";   // tmp를 다시 빈문자열 저장
        }
        return answer;
    }
}