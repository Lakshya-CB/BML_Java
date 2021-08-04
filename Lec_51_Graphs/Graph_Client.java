package Lec_51_Graphs;

import java.util.HashSet;

public class Graph_Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 2, 10);
		G.addEdge(2, 3, 15);
		G.addEdge(1, 4, 7);
		G.addEdge(3, 4, 20);
		G.addEdge(4, 5, 100);
		G.addEdge(5, 6, 11);
		G.addEdge(5, 7, 15);
		G.addEdge(6, 7, 30);
//		G.Disp();

//		System.out.println(G.hasPath(2, 6, new HashSet<>(),""));
//		
//		G.removeEdge(4, 5);
//		
//		System.out.println(G.hasPath(2, 6, new HashSet<>(),""));

//		G.AllPath(1, 6, new HashSet<>(), "");
		G.BFS(1, 6);
	}
}
