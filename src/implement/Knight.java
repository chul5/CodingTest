package implement;

import java.util.Scanner;

public class Knight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		int y = s.charAt(1) - '1' + 1;
		int x = s.charAt(0) - 'a' + 1;

		int[][] moves = {{2,1}, {1,2}, {-1,2}, {-2,1}, {-2, -1}, {-1,-2},{1,-2}, {2,-1}};
		int result = 0;
		for (int[] move : moves) {
			if (x + move[0] > 8 || x + move[0] < 1 || y + move[1] > 8 || y + move[1] < 1)
				continue;
			result++;
		}
		System.out.println("result = " + result);
	}
}
