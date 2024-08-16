package dfs;

import java.util.LinkedList;
import java.util.Scanner;

public class DfsList {
	private static LinkedList<LinkedList<Integer>> test = new LinkedList<>();
	private static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n + 1; i++)
			test.add(new LinkedList<>());
		initData();
		visited = new boolean[n + 1];
		dfs(1);
	}

	private static void dfs(int visit) {
		System.out.println("visit = " + visit);
		visited[visit] = true;
		for (int i : test.get(visit)) {
			if (!visited[i])
				dfs(i);
		}
	}

	private static void initData(){
		test.get(1).add(2);
		test.get(1).add(3);
		test.get(1).add(8);

		test.get(2).add(1);
		test.get(2).add(7);

		test.get(3).add(1);
		test.get(3).add(4);
		test.get(3).add(5);

		test.get(4).add(3);
		test.get(4).add(5);

		test.get(5).add(3);
		test.get(5).add(4);

		test.get(6).add(7);

		test.get(7).add(2);
		test.get(7).add(6);
		test.get(7).add(8);

		test.get(8).add(1);
		test.get(8).add(7);

	}
}
