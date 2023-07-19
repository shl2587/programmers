class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        // ∧는 둘중 한곳이 false가 나와야 하고 ∨ 둘다 false가 나와야 false가 결과값으로 나오므로
        // 두 식중 한곳은  false가 무조건 나와야함
        // 따라서 x1과 x2가 둘다 false이거나 x3와 x4가 false이어야함
        if ((x1 == x2 && x2 == false) || (x3 == x4 && x4 == false)) {
            answer = false;
        }
        return answer;
    }
}