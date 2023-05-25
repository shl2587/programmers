class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        int first = 0;  // 이중배열 요소의 0번째 요소를 담아줄 정수 first 선언 및 초기화
		int second = 0; // 이중배열 요소의 1번째 요소를 담아줄 정수 second 선언 및 초기화
		String tmp = "";        // my_strings의 요소를 담을 tmp 문자열 선언 및 빈문자열로 초기화
		String answer = "";

		for (int i = 0; i < parts.length; i++) {    // parts의 크기만큼 반복횟수 제어
            // 해당 정수로 이중 for문의 반복회수를 제어하기 위해
			first = parts[i][0];    // parts의 i번째 요소의 0번째 인덱스 요소를 저장
			second = parts[i][1];   // parts의 i번째 요소의 1번째 인덱스 요소를 저장
			tmp = my_strings[i];    // my_stiring의 i번째 문자열 요소를 tmp에 저장
			for (int j = first; j <= second; j++) { // first부터 second까지의 인덱스를 진행하여
				answer += tmp.charAt(j);    // answer에 tmp 문자열 i번째를 누적 합산
			}
		}
        return answer;
    }
}