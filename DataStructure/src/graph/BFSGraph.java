package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSGraph {
	
	int V;
	LinkedList<Integer> adjListArray[];
	
	public BFSGraph(int V) {
		this.V = V;
		adjListArray = new LinkedList[V];
		for(int i=0; i<V; i++) {
			adjListArray[i] = new LinkedList<Integer>();
		}
	}
	
	// directed graph
	public void addEdge(int u, int v) {
		adjListArray[u].add(v);
	}
	
	public void BFS(int s) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] =true;
		queue.add(s);
		while(queue.size()!=0) {
			s= queue.poll();
			System.out.println(s+ " ");
		
		
		Iterator<Integer> itr = adjListArray[s].listIterator();
		while(itr.hasNext()) {
			int n = itr.next();
			if(!visited[n]) {
				visited[n] = true;
				queue.add(n);
			}
		}
	}
	}
	
	public static void main(String[] args) {
		BFSGraph bfsGraph = new BFSGraph(4);
		
		bfsGraph.addEdge(0, 1);
		bfsGraph.addEdge(0, 2);
		bfsGraph.addEdge(1, 2);
		bfsGraph.addEdge(2, 0);
		bfsGraph.addEdge(2, 3);
		bfsGraph.addEdge(3, 3);
		
		System.out.println("Following is the BFS traversal starting from vertex 2");
		bfsGraph.BFS(2);
	}

}
