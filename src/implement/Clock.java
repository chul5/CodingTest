package implement;

import java.util.Scanner;

public class Clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int result=0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					String time = "" + i + j + k;
					if (time.contains("3"))
						result++;
				}
			}
		}
		System.out.println("result = " + result);
	}
}
