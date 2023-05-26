class Solution {
    public int[] solution(int[] numbers, String direction) {
        int tmp1;   // 배열의 요소의 위치를 바꾸기위해 잠시 담아줄 tmp1선언
        
        if (direction.equals("right")) {    // direction이 right면
            for (int i = numbers.length - 1; i != 0; i--) { // numbers의 인덱스 뒤에서부터 1씩 감소하여
                tmp1 = numbers[i];  // tmp1에 numbers i번째 요소를 저장
                numbers[i] = numbers[i-1];  // numbers i번째 요소에 i-1번째 요소를 저장
                numbers[i-1] = tmp1;    // tmp1에 저장되어있던 값을 numbers i-1번째 인덱스에 저장
            }
        }
        
        int tmp2;   // 배열의 요소의 위치를 바꾸기위해 잠시 담아줄 tmp2선언
        if (direction.equals("left")) {     // direction이 left이면
            for (int i = 0; i < numbers.length-1; i++) {    // numbers의 길이의 1보다 작게 범위 제어
                                                            // i + 1과 비교하기 위함
                tmp2 = numbers[i];              // tmp2 numbers i번째 요소를 저장
                numbers[i] = numbers[i + 1];    // numbers i번째에 i+1번째 요소를    저장
                numbers[i + 1] = tmp2;          // tmp2에 저장되어있던 i번째 요소를 i+1번째 배열에 저장
            }
        }
        
        return numbers;
    }
}