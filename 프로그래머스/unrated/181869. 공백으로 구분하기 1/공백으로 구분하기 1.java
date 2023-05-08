class Solution {
    public String[] solution(String my) {
        String tmp = " ";   // 빈칸을 찾기위한 빈칸 문자열 tmp선언 및 초기화
		int count = 1;  // 정답을 저장할 배열의 크기를 저장할 count 변수 선언
                        // - 공백보다 배열의 크기는 한개 더 많으므로 1로 초기화
		for (int i = 0; i < my.length(); i++) { // 해당 문자열만큼 반복하여
            if (String.valueOf(my.charAt(i)).equals(tmp)) { // 빈문자열이 나오면
                count++;    // count를 1씩 증가
            }
		}
		String[] answer = new String[count];    // 해당 크기만큼 배열 지정
        String result = ""; // 정답을 넘겨줄 문자열 저장 result 문자열 선언
        int j = 0;  // 정답을 저장할 배열의 인덱스 통제할 정수 변수 선언
        for (int i = 0; i < my.length(); i++) { // 글자의 크기만큼 반복 제어
            if (!String.valueOf(my.charAt(i)).equals(tmp)) {    // 빈 문자열이 아니면
                result += String.valueOf(my.charAt(i)); // result 문자열에 복합대입 연산자로 저장
                if (i == my.length() - 1) { // 마지막 문자열은 저장해주지 못하고 끝나므로
                                            // i가 마지막 인덱스를 가리키면
                	answer[j] = result;     // 마지막 배열에 요소 저장
                }
            }
            else {
                answer[j] = result; // 비교 대상에 빈 문자열이 나오면
                                    // 저장되어 있던 문자열을 배열에 삽입
                j++;                // 정답 배열 인덱스 1증가
                result = "";        // 문자열 저장을 위한 result 빈문자열을 저장하여 다음 코드 실행
            }
        }
        return answer;
    }
}