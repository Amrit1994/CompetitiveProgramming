package graph;

import java.util.LinkedList;;

public class AdjacencyList {

	static class Graph{
		
		int V;
		LinkedList<Integer> adjListArray[];
		
		Graph(int V){
			this.V = V;
			 // define the size of array as  
            // number of vertices 
			adjListArray = new LinkedList[V];
			
			
			 // Create a new list for each vertex 
            // such that adjacent nodes can be stored 
			for(int i=0; i<V; i++) {
				adjListArray[i] = new LinkedList<Integer>();
			}
		}
	}
	
	// Adds an edge to an undirected graph 
	static void addEdges(Graph graph, int u, int v) {
		
		// Add an edge from src to dest
		graph.adjListArray[u].add(v);
		
		// Since graph is undirected, add an edge from dest 
        // to src also 
		graph.adjListArray[v].add(u);
	}
	
	
	static void printGraph(Graph graph) {
		for(int i=0; i<graph.V; i++) {
			System.out.println("Adjacency List of vertex "+i);
			System.out.print("head");
			for(Integer list: graph.adjListArray[i]){
				System.out.print("-> "+list);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		int V =5;
		Graph graph = new Graph(V);
		addEdges(graph, 0, 1);
		addEdges(graph, 0, 2);
	//	addEdges(graph, 1, 0);
		addEdges(graph, 1, 3);
		//addEdges(graph, 2, 0);
		addEdges(graph, 2, 3);
		addEdges(graph, 2, 4);
		//addEdges(graph, 3, 1);
		//addEdges(graph, 3, 2);
		addEdges(graph, 3, 4);
		//addEdges(graph, 4, 2);
		//addEdges(graph, 4, 3);
		printGraph(graph);
		
	}
}
