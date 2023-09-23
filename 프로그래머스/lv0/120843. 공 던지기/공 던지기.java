class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        // idx를 통해 numbers의 인덱스를 통제
        int idx = 0;
        // 반복문은 k번 진행
        for (int i = 0; i < k; i++) {
            // idx가 numbers의 길이보다 작으면
            if (idx < numbers.length) {
                // answer에 numbers의 idx번째를 저장하고
                answer = numbers[idx];
                // 2를 더함
                idx += 2;
            }
            // 크거나 같으면
            else {
                // idx를 길이만큼 빼서 인덱스를 통제하고
                idx -= numbers.length;
                // 해당 idx번째를 answer에 저장
                answer = numbers[idx];
                // idx를 2를 더함
                idx += 2;
            }
            
        }
        
        
        
        return answer;
    }
}