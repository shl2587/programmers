class Solution {
    public String[] solution(String[] picture, int k) {
        // picture배열의 길이를 구하는 pic_len 선언 및 picture.length로 초기화
        int pic_len = picture.length;
        // pic_len만큼 반복하여 picture의 요소를 추출
        // - 향상된 for문을 사용하지 않는 이유는 picture에 길이가 k배 늘어난 문자열을 다시 저장하기 위함
        for(int i = 0; i < pic_len; i++) {
            // str문자열 선언 및 picture[i]로 초기화
            String str = picture[i];
            // k배 늘어난 문자열 저장을 위해 tmp 선언 및 빈문자열로 초기화
            String tmp = "";
            // j는 str의 인덱스를 제어하기 위함이고
            for (int j = 0; j < str.length(); j++) {
                // loop는 tmp에 해당 str인덱스 문자열을 더해주는 횟수를 제어하기 위함
                for (int loop = 0; loop < k; loop++) {
                    tmp += str.charAt(j);
                }
            }
            // picture의 i번째에 tmp로 요소 재삽입
            picture[i] = tmp;
        }
        
        // picture에 비해 k배 증가한 배열을 준비
        String[] answer = new String[pic_len * k];
        // answer의 인덱스를 통제
        int idx = 0;
        // 향상된 for문을 통해 picture의 요소를 대입
        for (String str : picture) {
            // loop로 answer에 해당 str을 반복해서 삽입할 횟수를 정하고
            for (int loop = 0; loop < k; loop++) {
                // answer의 idx번째에 str을 저장
                answer[idx] = str;
                // idx는 for문의 지역변수가 아니므로 1씩 증가하여 다음 배열 인덱스에 삽입
                idx++;
            }
        }
        return answer;
    }
}