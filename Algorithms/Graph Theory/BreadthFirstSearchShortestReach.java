import java.io.*;
import java.util.*;

public class BreadthFirstSearchShortestReach {

  public static class GraphBFS {
	 
   private int vertices; // Number of vertices
   private LinkedList<Integer> adj[]; // Adjacency List for each vertex
	 
   public GraphBFS(int size) {
    vertices = size;
    adj = new LinkedList[size];  
		            
   for(int i=0;i<size;i++) {
    adj[i] = new LinkedList();  
   }	   
  }
   
   public void addEdge(int first, int second) {
     adj[first].add(second);  
     adj[second].add(first);  
   }
		        
   public int[] shortestReach(int startId) { // 0 indexed
		            
   // Mark all the vertices of the graph as not visited. 
     boolean visited[] = new boolean[vertices];
		  
   // Create a queue for BFS.
     LinkedList<Integer> queue = new LinkedList<Integer>();
		            
     int[] distances = new int[vertices];
		             
     Arrays.fill(distances, -1);
		            
     distances[startId] = 0; 
		            
   // Mark the current node as visited and enqueue it.
     visited[startId] = true;
     queue.add(startId);
		            
     while(!queue.isEmpty()) {
   // Dequeue a vertex from queue and print it.  
       startId = queue.poll();
		   
   // Get all adjacent vertices of the dequeued vertex source. If the vertex has not been visited yet, then mark it visited and enqueue it.
			
       for(Integer neighbour : adj[startId]) {
	 if(!visited[neighbour]) {
	   visited[neighbour] = true;
	   queue.add(neighbour);
	   distances[neighbour] = distances[startId] + 6;   
	 }   
       }     
    }
  return distances;    
  }
 }   
	
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter the number of queries: ");
   int queries = scanner.nextInt();
	 	        
   for (int t = 0; t < queries; t++) {
		  
    System.out.println();
    System.out.print("Enter the number of nodes and the number of edges in the graph: ");  
   // Create a graph of size n where each edge weight is 6:
    GraphBFS graph = new GraphBFS(scanner.nextInt());
	 
    int m = scanner.nextInt();
	   
   // read and set edges
    for (int i = 0; i < m; i++) {   
      System.out.println();	  
      System.out.print("Enter two integers u and v which describe an edge connecting from node u to node v: ");	  
	  
      int u = scanner.nextInt() - 1;
      int v = scanner.nextInt() - 1;
		                
   // add each edge to the graph
      graph.addEdge(u, v);
    }
	  
    System.out.println();	  
    System.out.print("Enter the index of the starting node: ");	
		            
   // Find shortest reach from node s
    int startId = scanner.nextInt() - 1;
    int[] distances = graph.shortestReach(startId);
		 
    for (int i = 0; i < distances.length; i++) {  
      if (i != startId) {
	System.out.print(distances[i]);
	System.out.print(" ");
      }
     }
    System.out.println();            
   }
		        
 scanner.close();
 }
}
