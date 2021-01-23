package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GenericGraph<T> {
	
	private Map<T, List<T>> map = new HashMap<>();
	
	public void addVertex(T s) {
		map.put(s, new LinkedList<T>());
	}
	
	public void addEdges(T source, T destination, boolean biDirect) {
		if(!map.containsKey(source)) {
			addVertex(source);
		}
		if(!map.containsKey(destination)) {
			addVertex(destination);
		}
		map.get(source).add(destination);
		if(biDirect) {
			map.get(destination).add(source);
		}
	}
	
	
	public void getVertexCount() {
		System.out.println(map.keySet().size());
	}
	
	public void getEdgeCount(boolean biDir) {
		int count = 0;
		for(T v : map.keySet()) {
			count += map.get(v).size();
		}
		
		if(biDir) {
			count = count/2;
		}
		System.out.println("The graph has " +count+ "edges");
	}
	 	
	
	public void hasVertex(T s) {
		if(map.containsKey(s)) {
			System.out.println("The graph contains " +s +"as a verted");
		}else {
			System.out.println("The graph does not contains " +s +"as a verted");
		}
	}
	
	public void hasEdge(T s, T d) {
		if(map.get(s).contains(d)) {
			System.out.println("The graph has an edge b/w "+s+ "and "+d);
		}else {
			System.out.println("The graph has no edge b/w "+s+ "and "+d);
		}
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		for(T v : map.keySet()) {
			builder.append(v.toString()+".");
			for(T w : map.get(v)) {
				builder.append(w.toString()+ " ");
			}
			builder.append("\n");
		}
		return builder.toString();
	}
}


class Driver {
	public static void main(String[] args) {
		GenericGraph<Integer> g1 = new GenericGraph<Integer>();
		g1.addEdges(1, 2, true);
		g1.addEdges(2, 3, true);
		g1.addEdges(3, 4, true);
		g1.addEdges(4, 2, true);
		g1.addEdges(3, 1, true);
		System.out.println(g1.toString());
	}
}
