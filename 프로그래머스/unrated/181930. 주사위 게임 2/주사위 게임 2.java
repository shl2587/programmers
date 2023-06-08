class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // 코드 길이 간소화 및 가독성 증가를 위한 제곱값을 각각 변수로 지정
        int aa = a * a;
        int bb = b * b;
        int cc = c * c;
        // a와 b와 c가 모두 같다면
        if (a == b && b == c ) {
            // a,b,c의 합과 a의 제곱, b의 제곱, c의 제곱의 합과
            // a의 3제곱, b의 3제곱, c의 3제곱의 합을 구한 뒤 모두 곱함
            answer = (a + b + c) * (aa + bb + cc) * (aa * a + bb * b + cc * c);
        }
        // 모두 다르다면
        if (a != b && b != c && c != a) {
            // 3수의 합만 저장
            answer = a + b + c;
        }
        else if (a != b || b != c || c != a) {  // 하나만 다르더라도
            answer = (a + b + c) * (aa + bb + cc);  // a,b,c의 합과 a의 제곱, b의 제곱, c의 제곱의 합을 저장
        }
        return answer;
    }
}