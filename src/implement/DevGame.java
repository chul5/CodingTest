package implement;

import java.io.*;
import java.util.Scanner;

public class DevGame {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("src/input.txt"));
		//Scanner sc = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = line.charAt(0) - '0';
		int m = line.charAt(2) - '0';
		line = br.readLine();
		int row = line.charAt(0) - '0';
		int col = line.charAt(2) - '0';
		int direction = line.charAt(4) - '0';

		int endCheck = 0;
		char[][] map = new char[n][m];
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < m; j++)
				map[i][j] = s[j].charAt(0);
		}

		// 서있는 자리 방문
		map[row][col] = '1';
		int result = 1;

		int[] dRow = {-1, 0, 1, 0};
		int[] dCol = {0,-1,0,1};

		while (true) {
			direction = changeDirection(direction);
			int nRow = row + dRow[direction];
			int nCol = col + dCol[direction];
			if (map[nRow][nCol] == '0') {
				row = nRow;
				col = nCol;
				map[row][col] = '1';
				endCheck = 0;
				result++;
			}
			else
				endCheck++;
			if (endCheck == 4) {
				//뒤로 가는 로직
				nRow = row - dRow[direction];
				nCol = col - dCol[direction];
				if (map[nRow][nCol] == '1')
					break;
				row = nRow;
				col = nCol;
				endCheck = 0;
			}
		}
		System.out.println("result = " + result);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}


	}

	private static int changeDirection(int currentDirection) {
		if (currentDirection == 0)
			return 3;
		return currentDirection - 1;
	}

	private static boolean checkValid(char land) {
		return land == '1';
	}
}
