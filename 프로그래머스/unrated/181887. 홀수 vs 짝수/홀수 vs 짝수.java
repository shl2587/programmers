class Solution {
    public int solution(int[] num_list) {
        int odd = 0;    // 짝수번째 수의 합을 저장할 odd
        int even = 0;   // 홀수번째 수의 합을 저장할 even
        for (int i = 0; i < num_list.length; i++) { // num_list 길이까지 반복회수 제어
            if (i % 2 == 0) {   // i가 짝수일때
                odd += num_list[i]; // 해당 i번째 인덱스의 num_list의 요소를 odd에 저장
            }
            else {  // i가 홀수일때
                even += num_list[i];    // 해당 i번째 인덱스의 num_list의 요소를 even에 저장
            }
        }
        return odd > even ? odd : even; // 삼항연산자를 통해 크기를 비교한 뒤 큰 수를 반환
        
    }
}