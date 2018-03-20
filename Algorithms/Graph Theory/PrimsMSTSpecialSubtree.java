import java.io.*;
import java.util.*;

 public class PrimsMSTSpecialSubtree {
	 
    public static int minKey(int key[], Boolean MSTSet[], int vertices) {
      // Initialize min value
      int min = Integer.MAX_VALUE, min_index = -1;

      for (int v = 0; v < vertices; v++) {
	if (MSTSet[v] == false && key[v] < min) {
	  min = key[v];
	  min_index = v;
	}
      }
	  
      return min_index;
    }
		  
    public static void printMST(int parent[], int n, int graph[][], int vertices) {
      int sum = 0;
        
      System.out.println();
      System.out.print("The minimum sum of the weight of the edges of the tree is: ");

      for (int i = 1; i < vertices; i++) {
        sum += graph[i][parent[i]];
      }

      System.out.println(sum);
    }
	 
    public static void primMST(int graph[][], int vertices) {
      // Array to store constructed MST
      int parent[] = new int[vertices];

      // Key values used to pick minimum weight edge in cut
      int key[] = new int[vertices];

      // To represent set of vertices not yet included in MST
      Boolean mstSet[] = new Boolean[vertices];

      // Initialize all keys as INFINITE
      for (int i = 0; i < vertices; i++) {
        key[i] = Integer.MAX_VALUE;
        mstSet[i] = false;
      }

      key[0] = 0;     // Make key 0 so that this vertex is picked as first vertex
      parent[0] = -1; // First node is always root of MST

      // The MST will have V vertices
      for (int count = 0; count < vertices - 1; count++) {
        int u = minKey(key, mstSet, vertices);
        mstSet[u] = true;

        for (int v = 0; v < vertices; v++) {
          if (graph[u][v] != -1 && mstSet[v] == false && graph[u][v] < key[v]) {
            parent[v] = u;
            key[v] = graph[u][v];
          }
        }
      }

      printMST(parent, vertices, graph, vertices);
    }

    public static void main(String[] args) { 
      Scanner scanner = new Scanner(System.in);				  
      System.out.print("Enter the number of nodes and the number of edges in the graph: ");  
      // Create a graph of size n where each edge weight is 6:
      int numberOfNodes = scanner.nextInt();
      int numberOfEdges = scanner.nextInt();
	    
      int graph[][] = new int[numberOfNodes][numberOfNodes];
			 	   
      // read and set edges
      for (int rows[] : graph) {  
	Arrays.fill(rows, -1);  
      }
	   
      for (int i = 0; i < numberOfEdges; ++i) {
	System.out.println();	  
	System.out.print("Enter three integers x,y and r where x and y describe an edge connecting from node x to node y and r denotes the length of edge between these corresponding nodes: ");	  
			  
	int source = scanner.nextInt() - 1;
	int destination = scanner.nextInt() - 1;
	int weight = scanner.nextInt();
				                
	// add each edge to the graph
	graph[source][destination] = weight;
	graph[destination][source] = weight; 		 
      }
			  
      primMST(graph, numberOfNodes);        		        
    }
 }
      
