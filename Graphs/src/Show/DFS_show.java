package Show;

import java.util.ArrayList;

public class DFS_show {

    // Algorithm for searching a graph
    // depth - vertical before horizontal path
    // used to:
    // - Find the shortest path
    // - Detect Cycles in a Directed graph
    // - Determine the connectivity in a network
    // Runtime: O(|V|+|E|)

    public static void main(String[] args){
        // data structure - represents graphs.
        // stores a list of all vertices adjacent to each vertex
        int[][] adjList =  {{1, 2}, {0, 2}, {0, 1, 3, 4}, {2}, {2}, { }};
        //  (1) - (2) - (4)
        //   |  /  |
        //  (0)   (3)

        // (0)
        System.out.println(dfs(adjList));

    }

    static void dfsRecord(int[][] adjList, boolean[] visited, int node, ArrayList<Integer> result){
        visited[node] = true;
        result.add(node);

        for (int neighbourNode : adjList[node]){
            if (!visited[neighbourNode]){
                dfsRecord(adjList, visited, neighbourNode, result);
            }
        }

    }

    static ArrayList<Integer> dfs(int[][] adjList){
        boolean[] visited = new boolean[adjList.length];

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < adjList.length; i++){
            if (!visited[i])
                dfsRecord(adjList, visited, i, result);
        }

        return result;
    }

}


