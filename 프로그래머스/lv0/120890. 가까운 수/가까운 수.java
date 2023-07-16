class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];  // answer에 0번째 요소를 저장하여 비교 시작
        for (int i = 0; i < array.length - 1; i++) {
            // answer에 distance가 더 작은 값을 저장
            // 정수 n에서 answer와 i+1번째의 요소를 뺀 값을
            // distance1과 distance2에 각각 저장
            int distance1 = n - answer;
            System.out.println("dis1 : " + distance1);
            int distance2 = n - array[i+1];
            System.out.println("dis2 : " + distance2);
            // distance1과 distance2가 음수라면 각각 -1을 곱하고 저장
            if (distance1 < 0) distance1 *= -1;
            if (distance2 < 0) distance2 *= -1;
            if (distance1 > distance2) {
                answer = array[i+1];
            }
            // 길이가 같다면
            else if(distance1 == distance2) {
                // 더 작은 수를 answer에 저장
                answer = (answer < array[i+1]) ? answer : array[i+1];
            }
        }
        return answer;
    }
}