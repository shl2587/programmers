class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length / 5 + 1]; 
        if (names.length % 5 == 0) {    // names의 크기가 5로 나누어 떨어진다면
            answer = new String[names.length / 5];  // 크기에 1을 더해줄 필요가 없음
                                                    // 1을 더해주는 이유는 5명이 안되더라도 값을 추출해야 하기 때문임
        }
        int index = 0;  // names의 인덱스를 제어할 index 정수 변수 선언 및 0으로 초기화
        for (int i = 0; i < answer.length; i++) {   // answer의 크기만큼 반복횟수 제어
            answer[i] = names[index];   // answer[i]번째에 names의 index번째를 삽입
            index += 5; // index에 5를 더하여 각 무리의 첫번째 사람을 뽑아낼 것
        }
        return answer;
    }
}