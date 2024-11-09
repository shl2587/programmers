import java.util.*;

class Solution {
    
    class PossibleInfo {
        int possible;
        int index;
        
        public PossibleInfo(int possible, int index) {
            this.possible = possible;
            this.index = index;
        }
        
        public int getPossible() {
            return possible;
        }

        public int getIndex() {
            return index;
        }
    }
    
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<PossibleInfo> possible = new ArrayList<>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                possible.add(new PossibleInfo(rank[i], i));
            }
        }
        
        possible.sort(Comparator.comparing(PossibleInfo::getPossible));
        
        
        int score = 10000;
        for (int j = 0; j < 3; j++) {
            answer += possible.get(j).getIndex() * score;
            score /= 100;
        }
        return answer;
    }
}