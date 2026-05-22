public class Experiment {

    // Run BFS and DFS
    public void runTraversals(Graph g) {

        long startBFS = System.nanoTime();

        g.bfs(0);

        long endBFS = System.nanoTime();

        System.out.println(
                "BFS Execution Time: "
                        + (endBFS - startBFS)
                        + " ns"
        );

        System.out.println();

        long startDFS = System.nanoTime();

        g.dfs(0);

        long endDFS = System.nanoTime();

        System.out.println(
                "DFS Execution Time: "
                        + (endDFS - startDFS)
                        + " ns"
        );

        System.out.println(
                "--------------------------------"
        );
    }

    // Run tests
    public void runMultipleTests() {

        int[] sizes = {10, 30, 100};

        for (int size : sizes) {

            System.out.println(
                    "\nTesting Graph with "
                            + size
                            + " vertices"
            );

            Graph graph = new Graph();

            // Add vertices
            for (int i = 0; i < size; i++) {

                graph.addVertex(new Vertex(i));
            }

            // Add weighted edges
            for (int i = 0; i < size - 1; i++) {

                graph.addEdge(i, i + 1, 2);

                if (i + 2 < size) {

                    graph.addEdge(i, i + 2, 5);
                }
            }

            // Print small graph
            if (size == 10) {

                graph.printGraph();

                System.out.println();
            }

            runTraversals(graph);

            // Run Dijkstra
            graph.dijkstra(0);

            System.out.println(
                    "================================"
            );
        }
    }

    public void printResults() {

        System.out.println(
                "Experiment completed successfully."
        );
    }
}
