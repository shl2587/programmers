class Solution {
    public int[] solution(int[] num_list) {
        int index = num_list.length - 1;    // 반복문을 횟수를 정하기 위한 인덱스 설정
        int[] answer = new int[num_list.length];    // 뒤집은 배열을 저장하기 위한 배열 answer 선언
        for (int i = 0; i < num_list.length; i++) {   // 반복횟수 및 answer의 인덱스 제어문
            answer[i] = num_list[index];      // answer배열은 0부터
                                            // num_list는 마지막 배열부터
                                            // 요소를 추출하는 동시에 저장
            index--;                       // 이중 반복을 사용하지 않기 위해 --로 제어
        }
            
        return answer;    
    }
        
}