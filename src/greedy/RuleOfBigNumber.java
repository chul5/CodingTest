package greedy;
import java.util.*;

public class RuleOfBigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] plate = new int[n];
		int max=0;
		int max2=0;

		// 큰 수 찾기
		for (int i = 0; i < n; i++) {
			plate[i] = sc.nextInt();
			if (plate[i] > max)
				max = plate[i];
		}

		// 그 다음 큰 수 찾기
		for (int i = 0; i < n; i++){
			if (plate[i] > max2 && plate[i] != max)
				max2 = plate[i];
		}

		int quote = m / (k + 1);
		int rest = m % (k + 1);

		int result = (max * k + max2) * quote + rest * max;
		System.out.println(result);

	}
}
