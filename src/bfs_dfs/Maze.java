package bfs_dfs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Maze {
	private static int n;
	private static int m;
	private static int[][]maze;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input.txt"));

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		maze = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < m; j++) {
				maze[i][j] = s.charAt(j) - '0';
			}
		}
		bfs(0, 0);
		System.out.println("maze[n-1][m-1] = " + maze[n-1][m-1]);
	}

	private static void bfs(int x, int y) {
		LinkedList<Position> queue = new LinkedList<>();
		queue.add(new Position(x, y));
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		while (!queue.isEmpty()) {
			Position position = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nx = dx[i] +position.getX();
				int ny = dy[i] +position.getY();
				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;
				if (maze[nx][ny] == 1) {
					maze[nx][ny] = maze[position.getX()][position.getY()] + 1;
					queue.add(new Position(nx, ny));
				}
			}

		}
	}
}
class Position{
	private int x;
	private int y;
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}