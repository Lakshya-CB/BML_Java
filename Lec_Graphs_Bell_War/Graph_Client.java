package Lec_Graphs_Bell_War;

import java.util.HashSet;

public class Graph_Client {
	public static void main(String[] args) {
		Graph G = new Graph(4);
		G.addEdge(1, 2, 3);
		G.addEdge(1, 4, 7);
		G.addEdge(2, 1, 8);
		G.addEdge(2, 3, 2);
		G.addEdge(3, 1, 5);
		G.addEdge(3, 4, 1);
		G.addEdge(4, 1, 2);
		

//		G.BellmenFord(1);
		G.FloydWarshall();
	}
}
