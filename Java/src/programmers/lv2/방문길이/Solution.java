package programmers.lv2.방문길이;

class Solution {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][][][] visit = new boolean[11][11][11][11];

    public int solution(String dirs) {

        int answer = 0;

        int x = 0;
        int y = 0;

        int nextX = 5;
        int nextY = 5;

        int index = 0;

        for (char dir : dirs.toCharArray()) {
            x = nextX;
            y = nextY;
            switch (dir) {
                case 'U':
                    index = 0;
                    break;
                case 'D':
                    index = 1;
                    break;
                case 'R':
                    index = 2;
                    break;
                case 'L':
                    index = 3;
                    break;
            }

            nextX += dx[index];
            nextY += dy[index];

            if (nextX < 0 || nextY < 0 || nextX > 10 || nextY > 10) {
                nextX -= dx[index];
                nextY -= dy[index];
                continue;
            }

            if (!visit[x][y][nextX][nextY] && !visit[nextX][nextY][x][y]) {
                visit[x][y][nextX][nextY] = true;
                visit[nextX][nextY][x][y] = true;
                answer++;
            }
        }
        return answer;
    }
}