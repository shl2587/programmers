class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // 앞의 두 수의 차이를 저장할 difference 변수 선언 및 저장
        int difference = common[1] - common[0];
        int div = 0;
        if (common[0] != 0) {
            // div에 common[1] / common[0]의 값을 저장
            div = common[1] / common[0];
        }
        
        
        // 등차수열이면 두 수의 차이가 전부 같으므로 1,2번째 차이와 2,3번째 차이가 같아야함
        // 따라서 해당 숫자가 같으면 등차수열이므로
        if (common[2] - common[1] == difference) {
            // answer에 마지막 요소에 difference만큼 더한 수를 저장
            answer = common[common.length-1] + difference;
        }
        // 등차가 아니면 등비수열이므로
        else {
            // answer에 마지막 요소에 두수를 나눈 몫을 곱하여 저장
            answer = common[common.length-1] * div;
        }
        return answer;
    }
}