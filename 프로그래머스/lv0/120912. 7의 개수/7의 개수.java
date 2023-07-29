class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // strArr 문자열 배열 선언
        String[] strArr = new String[array.length];
        // strArr 문자열 배열 인덱스 통제 반복문
        for(int i = 0; i < strArr.length; i++) {
            // strArr에 문자열로 변환한 array요소를 저장
            strArr[i] = String.valueOf(array[i]);
            // strArr의 문자열 요소의 인덱스를 통제할 반복문
            for (int j = 0; j < strArr[i].length(); j++) {
                // tmp에 strArr요소의 각 문자열을 저장
                String tmp = String.valueOf(strArr[i].charAt(j));
                // tmp가 7과 같으면
                if (tmp.equals("7")) {
                    // answer을 1증가
                    answer++;
                }
            }
        }
        return answer;
    }
}