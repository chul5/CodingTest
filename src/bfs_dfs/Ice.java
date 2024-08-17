package bfs_dfs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ice {
	private static char[][] graph;
	private static int[] dx = {1,0,-1,0};
	private static int[] dy = {0,1,0,-1};
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input.txt"));

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		graph = new char[n][m];
		for (int i = 0; i < n; i++) {
			graph[i] = sc.nextLine().toCharArray();
		}

		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(dfs(i, j))
					result++;
			}
		}
		System.out.println("result = " + result);

	}

	private static boolean dfs(int i, int j) {
		if (graph[i][j] == '1')
			return false;
		graph[i][j] = '1';
		for (int m = 0; m < 4; m++){
			int x = i + dx[m];
			int y = j + dy[m];
			if (x < 0 || x >= graph.length || y < 0 || y >= graph[i].length)
				continue;
			if (graph[x][y] == '0')
				dfs(x, y);
		}
		return true;

	}
}
