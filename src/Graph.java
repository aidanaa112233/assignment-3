import java.util.*;

public class Graph {

    private Map<Integer, List<Edge>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Add vertex
    public void addVertex(Vertex v) {
        adjacencyList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    // Add weighted edge
    public void addEdge(int from, int to, int weight) {

        adjacencyList.get(from)
                .add(new Edge(to, weight));

        adjacencyList.get(to)
                .add(new Edge(from, weight));
    }

    // Print graph
    public void printGraph() {

        System.out.println("Weighted Graph Structure:");

        for (int vertex : adjacencyList.keySet()) {

            System.out.print(vertex + " -> ");

            for (Edge edge : adjacencyList.get(vertex)) {

                System.out.print(
                        edge.getDestination()
                                + "("
                                + edge.getWeight()
                                + ") "
                );
            }

            System.out.println();
        }
    }

    // BFS
    public void bfs(int start) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (Edge edge : adjacencyList.get(current)) {

                int neighbor = edge.getDestination();

                if (!visited.contains(neighbor)) {

                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println();
    }

    // DFS
    public void dfs(int start) {

        Set<Integer> visited = new HashSet<>();

        System.out.print("DFS Traversal: ");

        dfsHelper(start, visited);

        System.out.println();
    }

    private void dfsHelper(
            int vertex,
            Set<Integer> visited
    ) {

        visited.add(vertex);

        System.out.print(vertex + " ");

        for (Edge edge : adjacencyList.get(vertex)) {

            int neighbor = edge.getDestination();

            if (!visited.contains(neighbor)) {

                dfsHelper(neighbor, visited);
            }
        }
    }

    // Dijkstra Algorithm
    public void dijkstra(int start) {

        int size = adjacencyList.size();

        int[] distances = new int[size];
        boolean[] visited = new boolean[size];

        Arrays.fill(distances, Integer.MAX_VALUE);

        distances[start] = 0;

        for (int i = 0; i < size - 1; i++) {

            int minVertex = -1;

            for (int j = 0; j < size; j++) {

                if (!visited[j] &&
                        (minVertex == -1 ||
                                distances[j]
                                        < distances[minVertex])) {

                    minVertex = j;
                }
            }

            visited[minVertex] = true;

            for (Edge edge :
                    adjacencyList.get(minVertex)) {

                int neighbor =
                        edge.getDestination();

                int weight =
                        edge.getWeight();

                if (!visited[neighbor]
                        &&
                        distances[minVertex]
                                + weight
                                < distances[neighbor]) {

                    distances[neighbor] =
                            distances[minVertex]
                                    + weight;
                }
            }
        }

        System.out.println(
                "Dijkstra Shortest Paths from Vertex "
                        + start + ":"
        );

        for (int i = 0; i < size; i++) {

            System.out.println(
                    "To vertex "
                            + i
                            + " = "
                            + distances[i]
            );
        }
    }
}
