package week1;

public class W1E9 {

    private int m;
    private int n;
    private int color;
    private int weekColor;
    private boolean[][] visited;
    private int[][] image;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        this.image = image.clone();
        this.color = color;
        m = image.length;
        n = image[0].length;
        visited = new boolean[m][n];
        weekColor = image[sr][sc];
        visited[sr][sc] = true;
        this.image[sr][sc] = color;
        expand(sr, sc);
        return this.image;
    }

    private void doTheThing(int i, int j) {

        if (isOutOfBounds(i, j)) {
            return;
        }

        if (visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        if (image[i][j] != weekColor) {
            return;
        }
        image[i][j] = color;
        expand(i, j);
    }

    private boolean isOutOfBounds(int i, int j) {
        return (i < 0 || i >= m) || (j < 0 || j >= n);
    }

    private void expand(int i, int j) {
        doTheThing(i + 1, j);
        doTheThing(i - 1, j);
        doTheThing(i, j + 1);
        doTheThing(i, j - 1);
    }
}