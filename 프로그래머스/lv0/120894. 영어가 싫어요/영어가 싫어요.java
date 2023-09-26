class Solution {
    public long solution(String numbers) {
        long answer = 0;
        // 숫자를 영어로 표현한 배열 선언
        String[] numberAlphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // 해당 배열을 반복하여
        for (int i = 0; i < numberAlphabet.length; i++) {
            // 각 요소가 문자열에 포함되어있는지 확인
            if (numbers.contains(numberAlphabet[i])) {
                // 포함되어 있으면 해당 문자열을 현재의 i정수를 문자열 형태로 변환
                // - zero부터 시작하여 인덱스와 문자열 값이 일치하기 때문에 가능
                numbers = numbers.replaceAll(numberAlphabet[i], String.valueOf(i));
            }
        }
        // answer에 정수로 변환한 numbers를 저장
        answer = Long.parseLong(numbers);
        return answer;
    }
}