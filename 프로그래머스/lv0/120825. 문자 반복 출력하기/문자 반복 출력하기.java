class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int size = my_string.length() * n;  // 각 문자열을 n번 반복한  문자열을 담을
                                            // 배열의 크기를 정하는 정수 변수 size 선언 및 초기화
        char[] ch = new char[size];         // 문자열의 각 자리수를 반복하기 위해 char형태의 배열 ch 생성
        for (int i = 0; i < my_string.length(); i++) {  // my_string의 길이만큼 반복
            int n2 = (i * n);   // n번씩 반복하여 인덱스를 제어하기 위한 n2 정수 변수 선언 및 초기화
            for (int j = 0; j < n; j++) {   // my_string의 문자열 각 자리를 n번씩 불러오기 위한
                                            // 반복문 제어문 작성
            	ch[n2] = my_string.charAt(i);   // ch의 n2번째에 해당 문자열을 char형태로 삽입하고
                n2++;                           // n2를 1씩 증가
            }
        }
        
        answer = String.valueOf(ch);    // 해당 char배열을 문자열로 변환
        return answer;
    }
}