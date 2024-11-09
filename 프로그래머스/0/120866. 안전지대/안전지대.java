import java.util.*;

class Solution {
    public int solution(int[][] board) {
        Set<List<Integer>> dangerRegion = new HashSet<>();
        int length = board.length;
        int totalArea = length * length;

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                if (board[x][y] == 1) {
                    int coordinateX = x - 1;
                    for (int i = 1; i <= 3; i++) {
                        int coordinateY = y - 1;
                        if (coordinateX < 0 || coordinateX >= length) {
                            coordinateX++;
                            continue;
                        }
                        for (int j = 1; j <= 3; j++) {
                            if (coordinateY < 0 || coordinateY >= length) {
                                coordinateY++;
                                continue;
                            }
                            dangerRegion.add(Arrays.asList(coordinateX, coordinateY));
                            coordinateY++;
                        }
                        coordinateX++;
                    }
                }
            }
        }
        
        return totalArea - dangerRegion.size();
    }
}