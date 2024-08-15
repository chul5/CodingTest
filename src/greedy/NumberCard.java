package greedy;
import java.util.*;
public class NumberCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
			Arrays.sort(arr[i]);
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i][0] > max)
				max = arr[i][0];
		}

		System.out.println(max);
	}
}
