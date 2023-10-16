class Solution {
    public int solution(String[] spell, String[] dic) {
        // 존재하는지 여부 확인만 하면 되므로 answer를 2로 초기화
        int answer = 2;
        // 향상된 for문을 통해 dic에 있는 요소하나씩 비교
        for (String dic_str : dic) {
            // 해당 단어가 전부 포함되어 있는지 확인하기 위한 count변수 선언 및 0으로 초기화
            int count = 0;
            // spell의 요소를 하나씩 꺼내어
            for (String str : spell) {
                // dic_str에 포함되어 있는지 확인
                if (dic_str.contains(str)) {
                    // 포함되어 있다면 count에 1증가
                    count++;
                }
            }
            // count가 spell의 길이와 같다는 것은 전부 포함되어 있다는 의미이므로
            if (count == spell.length) {
                // answer에 1저장
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}