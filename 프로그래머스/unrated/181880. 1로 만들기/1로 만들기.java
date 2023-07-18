class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length; i++) {
            // j를 num_list의 요소로 설정하고 2의 몫으로 저장
            for (int j = num_list[i]; j != 1; j /= 2) {
                // 해당 반복문이 실행될때마다 answer을 1증가
                answer++;
            }
        }
        return answer;
    }
}