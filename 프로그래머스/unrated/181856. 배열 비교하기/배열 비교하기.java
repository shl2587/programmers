class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        // 두 배열의 길이가 같을 때
        int arr1_sum = 0;   // arr1의 요소 합을 저장할 arr1_sum 선언 및 덧셈 항등원으로 초기화
        int arr2_sum = 0;   // arr2의 요소 합을 저장할 arr2_sum 선언 및 덧셈 항등원으로 초기화
        if (arr1.length == arr2.length) {   // 두 배열의 길이가 같다면
            for (int i = 0; i < arr1.length; i++) { // arr1과 arr2의 길이가 같기 때문에
                                                    // arr1의 크기로 반복횟수를 제어
                // arr1과 arr2의 요소를 각각 누적 덧셈
                arr1_sum += arr1[i];
                arr2_sum += arr2[i];
            }
        }
        if (arr1.length > arr2.length || arr1_sum > arr2_sum) {    // arr1의 길이가 길거나 arr1요소의 합이 크다면
            answer = 1; // answer에 1을 저장
        }
        else if (arr1.length < arr2.length || arr1_sum < arr2_sum) {   // arr2의 길이가 길거나 arr2요소의 합이 크다면
            answer = -1; // answer에 -1을 저장
        }
        // 나머지는 모두 같은 경우이므로 초기값을 반환
        return answer;
    }
}