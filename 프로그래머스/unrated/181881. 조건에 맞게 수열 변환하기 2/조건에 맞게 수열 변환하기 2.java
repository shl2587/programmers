import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true) {
            // 배열이 참조형식이 아닌 요소만 복사하는 형태로 새로운 배열에 추가
            int[] check_arr = Arrays.copyOf(arr, arr.length);    
            // 조건에 맞게 요소들을 변경
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] *= 2;
                    arr[i] += 1;
                }
            }
            // 해당 for문을 통과했으면 answer에 1증가
            answer++;
            // 만약 이전 요소들을 저장해준 새로운 배열과 값을 바꿔준 배열의 요소가 다르면 계속하고
            // 같으면 answer에 1을 빼고 반복문 중단
            // - 1을 빼주는 이유는 for문으로 요소를 변경해주지 않았지만 필수적으로 answer가 1을 증가시키는 구조이기 때문
            if (Arrays.equals(check_arr, arr)) {
                answer--;
                break;
            }
        }
        return answer;
    }
}