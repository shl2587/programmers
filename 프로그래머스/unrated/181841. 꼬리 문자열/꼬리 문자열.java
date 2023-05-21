class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (int i = 0; i < str_list.length; i++) { // str_list의 길이만큼 반복제어
            if (!str_list[i].contains(ex)) {    // 해당 i번째 배열에 ex가 포함되어 있지 않다면
                answer += str_list[i];  // 복합대입 연산자를 통해 누적합산
            }
        }
        return answer;
    }
}