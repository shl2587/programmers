class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        // 이차원 배열을 반복하여
        for (int i = 0; i < db.length; i++) {
            // 해당 인덱스의 아이디가 입력값과 같으면
            if (db[i][0].equals(id_pw[0])) {
                // password검사를 위한 password 논리값을 생성하고 false로 초기화
                boolean password = false;
                // 동일 인덱스의 비밀번호도 일치하면
                if (db[i][1].equals(id_pw[1])) {
                    // password에 true를 저장하고
                    password = true;
                }
                // password가 true면
                if (password) {
                    // answer에 login을 저장
                    answer = "login";
                    break;
                }
                // 비밀번호가 틀리다면
                else {
                    // answer에 wrong pw를 저장
                    answer = "wrong pw";
                    break;
                }
            }
            // 비밀번호가 일치하지 않으면
            else {
                // fail을 저장
                answer = "fail";
            }
        }
        return answer;
    }
}
