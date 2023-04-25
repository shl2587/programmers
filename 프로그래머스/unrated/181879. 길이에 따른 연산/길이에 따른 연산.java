class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length < 11) { // 매개변수로 주어진 배열의 길이가 10이하이면
            answer = 1;             // answer에 1을 저장
        }
        if (answer == 0) {          // answer이 0이라는 뜻은 위의 조건을 만족하지 못한다는 것으로
            for (int i = 0; i < num_list.length; i++) { // 해당 배열의 길이만큼의 반복문을 작성하여
                answer += num_list[i];  // 정답을 복합대입연산자로 모두 더해줌
            }
        }
        if (answer == 1) {          // answer이 1이라는 뜻은 첫 if문의 조건을 충족한다는 의미로
            for (int i = 0; i < num_list.length; i++) { // 해당 배열의 길이만큼의 반복문을 작성하여
                answer *= num_list[i];  // answer에 복합대입연산자를 통해 모두 곱해줌
            }
        }
        
        return answer;
    }
}