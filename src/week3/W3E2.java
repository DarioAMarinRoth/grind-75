package week3;

import java.util.ArrayDeque;
import java.util.Queue;

public class W3E2 {

    static void main() {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        W3E2 sol = new W3E2();
        sol.updateMatrix(mat);
    }

    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        boolean[][] elementsVisited = new boolean[m][n];
        Queue<int[]> nextElements = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    nextElements.add(new int[]{i, j, 0});
                }
            }
        }

        while (!nextElements.isEmpty()) {

            int[] element = nextElements.poll();

            if (outOfBounds(element, n, m)) continue;
            if (elementsVisited[element[0]][element[1]]) continue;

            elementsVisited[element[0]][element[1]] = true;
            ans[element[0]][element[1]] = element[2];

            nextElements.add(new int[]{element[0] + 1, element[1], element[2] + 1});
            nextElements.add(new int[]{element[0] - 1, element[1], element[2] + 1});
            nextElements.add(new int[]{element[0], element[1] + 1, element[2] + 1});
            nextElements.add(new int[]{element[0], element[1] + 1, element[2] + 1});
        }
        return ans;
    }


    boolean outOfBounds(int[] element, int n, int m) {
        return (element[0] < 0 || element[0] >= m) || (element[1] < 0 || element[1] >= n);
    }
}

