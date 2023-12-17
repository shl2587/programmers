import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        final int finalB = b;
        List<Integer> aMeasure = new ArrayList<>();
        List<Integer> bMeasure = new ArrayList<>();
        
        
        // 1에서 a까지 혹은 1에서 b까지의 범위 설정 후
        // filter를 통해 약수를 골라내고
        // forEach를 통해 해당 정수를 각각의 리스트에 추가
        IntStream.rangeClosed(1, a)
            .filter(i -> a % i == 0)
            .forEach(i -> aMeasure.add(i));
        
        // 왜인지 모르겠지만 b만 final규칙에서 어긋났다는 오류가 발생
        IntStream.rangeClosed(1, finalB)
            .filter(j -> finalB % j == 0)
            .forEach(j -> bMeasure.add(j));
        
        // 두 리스트를 비교하여 공통약수를 추출하는 과정
        List<Integer> matchList = aMeasure.stream()
            .filter(i-> bMeasure.stream()
                    .anyMatch(Predicate.isEqual(i)))
            .collect(Collectors.toList());
        
        b /= matchList.get(matchList.size() - 1);
        
        // b가 2 또는 5로만 나뉠때 까지 반복문 실행
        while(b % 2 == 0 || b % 5 == 0) {
            if (b % 2 == 0) {
                b /= 2;
            }
            if (b % 5 == 0) {
                b /= 5;
            }
        }
        
        // 위의 반복문 결과 b가 1일 아니라는 것은 해당 숫자가 2 또는 5가 아닌 소인수라는 의미
        if (b != 1) {
            answer = 2;
        }
        
        
        return answer;
    }
}