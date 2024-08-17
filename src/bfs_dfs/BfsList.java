package bfs_dfs;

import java.util.LinkedList;

public class BfsList {
	private static final int SIZE = 9;
	private static LinkedList<LinkedList<Integer>> test = new LinkedList<>();
	private static boolean[] visited = new boolean[SIZE];
	private static LinkedList<Integer> queue = new LinkedList<>();
	public static void main(String[] args) {
		for (int i = 0; i < SIZE; i++) {
			test.add(new LinkedList<>());
		}
		initData();
		bfs(1);

	}

	private static void bfs(int visit) {
		queue.add(visit);
		visited[visit] = true;
		while (!queue.isEmpty()) {
			int node = queue.remove();
			System.out.println("node = " + node);
			for (int i : test.get(node)) {
				if (!visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
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
