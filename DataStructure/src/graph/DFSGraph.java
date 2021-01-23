package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class DFSGraph {

	static class Graph{
		
		int V; 
		LinkedList<Integer> [] adj;
		
		public Graph(int V) {
			this.V = V;
			adj = new LinkedList[V];
			
			for(int i=0; i<adj.length; i++) {
				adj[i] = new LinkedList<Integer>(); 	
			}
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
		}
		
		void DFS(int s) {
			
			Vector<Boolean> visted = new Vector<Boolean>();
			
			for(int i=0; i<V; i++) {
				visted.add(false);
			}
			
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(s);
			
			while(stack.empty() == false) {
				
				s = stack.peek();
				stack.pop();
				
				if(visted.get(s) == false) {
					System.out.println(s+ " ");
					visted.set(s, true);
				}
				Iterator<Integer> itr = adj[s].iterator();
				
				while(itr.hasNext()) {
					int v = itr.next();
					if(!visted.get(v)) {
						stack.push(v);	
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 0);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 0);
		System.out.println("Following is the Depth First Traversal");
		g.DFS(4);
	}
}
