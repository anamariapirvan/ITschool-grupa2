package session5.homework;

public class MazePathFinding {
    static char[][] maze = {
            {'S', '1', '0', '1'},
            {'0', '1', '0', '1'},
            {'0', '1', '0', '1'},
            {'1', '0', '0', 'E'}
    };

    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Sus, Jos, Stânga, Dreapta

    public static void main(String[] args) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        boolean found = findPath(0, 0, visited);

        if (found) {
            printMazeWithPath(visited);
        } else {
            System.out.println("Nu s-a găsit soluție.");
        }
    }

    static boolean findPath(int row, int col, boolean[][] visited) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length ||
                maze[row][col] == '1' || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        if (maze[row][col] == 'E') {
            return true;
        }

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (findPath(newRow, newCol, visited)) {
                return true;
            }
        }

        visited[row][col] = false;
        return false;
    }

    static void printMazeWithPath(boolean[][] visited) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (visited[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(maze[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

