package implement;

import java.util.*;
public class LRUD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] cmds = sc.nextLine().split(" ");
		int row = 1;
		int col = 1;

		for (String cmd : cmds) {
			if (cmd.equals("L")){
				if (col - 1 < 1)
					continue;
				col -= 1;
			}
			if (cmd.equals("R")){
				if (col + 1 > n)
					continue;
				col += 1;
			}
			if (cmd.equals("U")){
				if (row - 1 < 1)
					continue;
				row -= 1;
			}
			if (cmd.equals("D")){
				if (row + 1 > n)
					continue;
				row += 1;
			}
		}
		System.out.println(row + " " + col);
	}
}
