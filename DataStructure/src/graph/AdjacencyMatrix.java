package graph;

public class AdjacencyMatrix {

	private boolean adjMatrix[][];
	private int numVertices;
	
	public AdjacencyMatrix(int numVertices) {
		super();
		this.numVertices = numVertices;
		adjMatrix = new boolean[numVertices][numVertices];
	}
	
	
	public void addEdge(int i, int j) {
		adjMatrix[i][j] = true;
		adjMatrix[j][i] = true;
		
	}
	
	public void removeEdge(int i, int j) {
		adjMatrix[i][j] = false;
		adjMatrix[j][i] = false;
		
	}
	
	public boolean isEdge(int i, int j) {
		return adjMatrix[i][j];
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<numVertices; i++) {
			sb.append(i+ ":");
			for(boolean j : adjMatrix[i]) {
//				System.out.println("j== "+ j+ " i== "+i);
				sb.append(j?1:0 + "");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	
	public static void main(String [] args) {
		AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(4);
		adjacencyMatrix.addEdge(0, 1);
		adjacencyMatrix.addEdge(0, 2);
		adjacencyMatrix.addEdge(1, 2);
		adjacencyMatrix.addEdge(2, 3);
		//adjacencyMatrix.addEdge(0, 1);
		System.out.println(adjacencyMatrix.toString());
	}
}
