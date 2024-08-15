package greedy;

import java.util.*;
public class ToOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int result = 0;
		while (n > 1) {

			result += n % k;
			n -= n % k;
			n /= k;
			result++;
		}
		System.out.println("result = " + result);
	}
}
