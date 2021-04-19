package Lec_21;

import java.util.ArrayList;

public class Rec_type_3_cont {
	public static void main(String[] args) {
//		System.out.println(climb_loop(0, 5));
//		System.out.println(climb(0, 5));
		System.out.println(Maze_move(0, 0, 2, 2));
	}
	public static ArrayList<String> Maze_move(int x, int y, int xd, int yd) {
		if (x == xd && y == yd) { // +ve BC
			ArrayList<String> ans = new ArrayList<>();
			ans.add("");
			return ans;
		}
		// -ve BC
		if (x > xd || y > yd) {
			ArrayList<String> ans = new ArrayList<>();
			return ans;
		}
		ArrayList<String> sp1 = Maze_move(x + 1, y, xd, yd);// Moved right
		ArrayList<String> sp2 = Maze_move(x, y + 1, xd, yd);// Moved down
		ArrayList<String> ans = new ArrayList<>();
		for (String path : sp1) {
			ans.add('R' + path);
		}
		for (String path : sp2) {
			ans.add('D' + path);
		}
		return ans;
	}
	public static ArrayList<String> climb(int currlvl, int dist) {
		if (currlvl == dist) { // +ve BC
			ArrayList<String> ans = new ArrayList<>();
			ans.add("");
			return ans;
		}
		if (currlvl > dist) { // -ve BC
			ArrayList<String> ans = new ArrayList<>();
//			ans.add("");
			return ans;
		}
		ArrayList<String> sp1 = climb(currlvl + 1, dist); // 1 step 1 jump
		ArrayList<String> sp2 = climb(currlvl + 2, dist); // 2 step 2 jump
		ArrayList<String> sp3 = climb(currlvl + 3, dist); // 3 step 3 jump

		ArrayList<String> ans = new ArrayList<>();
		for (String path : sp1) {
			ans.add('1' + path);
		}
		for (String path : sp2) {
			ans.add('2' + path);
		}
		for (String path : sp3) {
			ans.add('3' + path);
		}
		return ans;
	}

	public static ArrayList<String> climb_loop(int currlvl, int dist) {
		if (currlvl == dist) { // +ve BC
			ArrayList<String> ans = new ArrayList<>();
			ans.add("");
			return ans;
		}
		ArrayList<String> ans = new ArrayList<>();
		for (int jump = 1; jump <= 3 && currlvl + jump <= dist; jump++) {
			ArrayList<String> sp1 = climb_loop(currlvl + jump, dist); // 1 step 1 jump
			for (String path : sp1) {
				ans.add(jump + path);
			}
		}
		return ans;
	}
}
