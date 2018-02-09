package Graph;
//Java program to print BFS traversal from a given source vertex.
//BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

public class GraphBreadthFirstTransversal{
	private int V;   // No. of vertices
	private LinkedList<Integer> adj[]; //Adjacency Lists

	GraphBreadthFirstTransversal(int v){
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v,int w){
		adj[v].add(w);
	}

	// prints BFS traversal from a given source s
	void BFS(int s){
		boolean visited[] = new boolean[V];

		Queue<Integer> queue = new LinkedList<Integer>();

		visited[s]=true;
		queue.add(s);

		while (!queue.isEmpty()){
			s = queue.poll();
			System.out.print(s+" ");

			LinkedList<Integer> temp = adj[s];

			for(Integer x: temp) {
				if (!visited[x]){
					visited[x] = true;
					queue.add(x);
				}
			}
		}
	}

	void DFSUtil(int v,boolean visited[]){
		visited[v] = true;
		System.out.print(v+" ");

		LinkedList<Integer> temp = adj[v];

		for(Integer x: temp) {
			if (!visited[x]){
				DFSUtil(x, visited);
			}
		}
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void DFS(int v){
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);
	}

	// Driver method to
	public static void main(String args[])
	{
		GraphBreadthFirstTransversal g = new GraphBreadthFirstTransversal(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("BFS Traversal from vertex 2: ");

		g.BFS(2);
		System.out.println("\nFollowing is Depth First Traversal (starting from vertex 2)");
		g.DFS(2);
	}
}