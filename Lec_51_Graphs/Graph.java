package Lec_51_Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import Lec_42_43.Linked_List;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int V) {
		// TODO Auto-generated constructor stub

		map = new HashMap<Integer, HashMap<Integer, Integer>>();
		for (int i = 1; i <= V; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int V1, int V2, int cost) {
		map.get(V1).put(V2, cost);
		map.get(V2).put(V1, cost);
	}

	public boolean containsEdge(int V1, int V2) {
		return map.get(V1).containsKey(V2) && map.get(V2).containsKey(V1);
	}

	public void removeEdge(int V1, int V2) {
		map.get(V1).remove(V2);
		map.get(V2).remove(V1);
	}

	public int TotalEdges() {
		int sum = 0;
		for (int V : map.keySet()) {
			sum += map.get(V).size();
		}
		return sum / 2;
	}

	public void Disp() {
		for (int V1 : map.keySet()) {
			System.out.println(V1 + "  ->  " + map.get(V1));
		}
	}

	public boolean hasPath(int src, int dest, HashSet<Integer> Visited, String str) {
//		System.out.println(src + " - " + dest);
		Visited.add(src);
		if (src == dest) {
			System.out.println(str);
			return true;
		}
		for (int nbr : map.get(src).keySet()) {
			if (!Visited.contains(nbr)) {
				boolean res = hasPath(nbr, dest, Visited, str + " " + src + " to");
				if (res) {
					return true;
				}
			}
		}
		return false;
	}

	public void AllPath(int src, int dest, HashSet<Integer> Visited, String str) {
//		System.out.println(src + " - " + dest);
//		Visited.add(src);
		if (src == dest) {
			System.out.println(str);
//			Visited.remove(src);
			return;
		}
		Visited.add(src);
		for (int nbr : map.get(src).keySet()) {
			if (!Visited.contains(nbr)) {
				AllPath(nbr, dest, Visited, str + " " + src + " to");

			}
		}
		Visited.remove(src);
		return;
	}

	public boolean BFS(int src, int dest) {
		HashSet<Integer> Visited = new HashSet<>();
		Queue<Integer> Q = new LinkedList();

		Q.add(src);
		Visited.add(src);
		String str = "";
		while (!Q.isEmpty()) {
			int V = Q.poll();
//			System.out.print(V + " ");
			if (V == dest) {
				return true;
			}
			for (int nbr : map.get(V).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
					Visited.add(nbr);
				}
			}

		}
		return false;
	}
	public boolean DFS(int src, int dest) {
		HashSet<Integer> Visited = new HashSet<>();
		Stack<Integer> Q = new Stack();

		Q.add(src);
		Visited.add(src);
		String str = "";
		while (!Q.isEmpty()) {
			int V = Q.poll();
//			System.out.print(V + " ");
			if (V == dest) {
				return true;
			}
			for (int nbr : map.get(V).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
					Visited.add(nbr);
				}
			}

		}
		return false;
	}
}
