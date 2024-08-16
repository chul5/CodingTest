package bfs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;

public class TestStack {
	public static void main(String[] args) {
		LinkedList<Integer> test = new LinkedList<>();
		test.add(0); // 뒤에 삽입
		test.add(1); // 0, 1

		test.push(2); // 앞에 삽입 2, 0, 1

		System.out.println("test = " + test);
		System.out.println("test.poll() = " + test.poll()); //  앞에 제거 2
		System.out.println("test.remove() = " + test.remove()); // 앞에 제거 0



		System.out.println("test = " + test);
		System.out.println(test.get(0));



	}
}
