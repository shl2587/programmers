class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = null;
        // arr의 배열요소의 길이를 one_dimensional로 설정
        int one_dimensional = arr[0].length;
        // arr의 길이를 two_dimensional로 설정
        int two_dimensional = arr.length;
        
        // arr의 길이가 arr 배열요소의 길이보다 길면
        if (arr.length > arr[0].length) {
            // arr길이를 answer의 크기로 설정하고
            answer = new int[two_dimensional][two_dimensional];
            // arr배열의 요소의 배열요소를 answer에 저장
            for (int i = 0; i < two_dimensional; i++) {
                for (int j = 0; j < one_dimensional; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        
        // arr 배열요소의 길이가 arr의 길이보다 길면
        if (arr.length < arr[0].length) {
            // answer의 크기를 arr배열의 요소의 길이로 설정하고
            answer = new int[one_dimensional][one_dimensional];
            // answer에 arr배열의 요소를 삽입
            for (int i = 0; i < two_dimensional; i++) {
                answer[i] = arr[i];
            }
        }
        
        // 두 길이가 같으면 answer에 arr을 삽입
        if (arr.length == arr[0].length) {
            answer = arr;
        }
        return answer;
    }
}