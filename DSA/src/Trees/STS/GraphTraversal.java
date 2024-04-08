import java.util.*;

public class GraphTraversal {

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {
                { 0, 1, 1, 0 }, // Node 0
                { 0, 0, 1, 0 }, // Node 1
                { 1, 0, 0, 1 }, // Node 2
                { 0, 0, 0, 1 } // Node 3
        };

        int startNode = 0; // Start traversal from Node 0

        System.out.println("BFS Traversal:");
        bfs(adjacencyMatrix, startNode);

        System.out.println("\nDFS Traversal:");
        boolean[] visited = new boolean[adjacencyMatrix.length];
        dfs(adjacencyMatrix, startNode,visited);
    }

    static void bfs(int[][] matrix, int startNode){
        boolean[] visited = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr + " ");

            for(int i = 0;i<matrix.length;i++){
                if(matrix[curr][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void dfs(int[][] matrix, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node+" ");

        for(int i = 0;i<matrix.length;i++){
            if(matrix[node][i] == 1 && !visited[i]){
                dfs(matrix, i, visited);
            }
        }
    }

}
