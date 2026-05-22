                                  
Name:Tumenbai Aidana
Group:SE-2511
# Graph Traversal and Dijkstra Algorithm Project













## Overview

This project was developed in Java using Object-Oriented Programming principles. The program demonstrates graph traversal algorithms and shortest path calculation in weighted graphs.

The project includes:

* Breadth-First Search (BFS)
* Depth-First Search (DFS)
* Dijkstra’s Algorithm
* Weighted graph structure
* Execution time measurement

---

# Bonus Task Description

For the bonus task, the graph project was extended to support weighted edges and Dijkstra’s shortest path algorithm.

The following method was implemented:

```java id="uqgrja"
void dijkstra(int start)
```

The algorithm calculates the shortest distance from the starting vertex to all other vertices in the graph.

---

# Implemented Features

* Added weighted edges
* Updated the Edge class with a weight field
* Modified the graph structure to store weighted edges
* Implemented Dijkstra’s shortest path algorithm
* Printed shortest path results clearly
* Used arrays for distances and visited vertices
* Used simple loops without PriorityQueue

---

# Project Structure

```text id="ow93sx"
├── Edge.java
├── Vertex.java
├── Graph.java
├── Experiment.java
└── Main.java
```

---

# Weighted Graph

The graph uses an adjacency list with weighted edges.

Example:

```text id="jlwm3p"
0 -> 1(2) 2(5)
```

This means:

* vertex 0 is connected to vertex 1 with weight 2
* vertex 0 is connected to vertex 2 with weight 5

---

# Dijkstra Algorithm

The algorithm works using:

* distance array
* visited array
* loops for finding the minimum distance vertex

Example arrays:

```java id="wjlfgx"
int[] distances;
boolean[] visited;
```

The shortest distances are updated step by step until all vertices are processed.

---

# Example Output

```text id="5sh3mn"
Dijkstra Shortest Paths from Vertex 0:
To vertex 0 = 0
To vertex 1 = 2
To vertex 2 = 4
To vertex 3 = 6
```

---

# Technologies Used

* Java
* OOP
* Graph Algorithms
* BFS
* DFS
* Dijkstra Algorithm

---

# Conclusion

This project demonstrates graph traversal and shortest path algorithms in Java. The bonus task successfully extends the graph implementation with weighted edges and Dijkstra’s Algorithm functionality.
