                                  
Name:Tumenbai Aidana
Group:SE-2511
# Graph Traversal and Dijkstra Algorithm Project
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 45 11" src="https://github.com/user-attachments/assets/094e815d-cf8a-40d8-8045-f602dd25c0cf" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 45 40" src="https://github.com/user-attachments/assets/623f6a4e-c0b0-410c-8e8a-ebba626f24a6" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 46 02" src="https://github.com/user-attachments/assets/76b1f189-510e-48a9-944b-8c26ef2e597b" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 46 13" src="https://github.com/user-attachments/assets/d478a823-8ad7-402c-bbfb-34d42aaf0d1d" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 46 23" src="https://github.com/user-attachments/assets/e54b5fe2-7d48-4ed7-bccc-5538d851d06f" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 46 34" src="https://github.com/user-attachments/assets/5392d88f-41f5-410a-b5c5-61a9ffc1607b" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 46 49" src="https://github.com/user-attachments/assets/08608646-2f65-4f36-afd2-7c8fbce34de0" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 46 59" src="https://github.com/user-attachments/assets/011039b9-730b-4cf9-abc8-f4a6d8ae2181" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 47 07" src="https://github.com/user-attachments/assets/613a4af6-f182-45b4-b787-3084212ba32a" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 47 19" src="https://github.com/user-attachments/assets/e9d4ae81-8515-4379-9113-1521a97f5000" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 47 27" src="https://github.com/user-attachments/assets/6602d206-acb2-435c-b103-1b17183b6290" />
<img width="1600" height="900" alt="WhatsApp Image 2026-05-22 at 19 47 38" src="https://github.com/user-attachments/assets/554bb7bf-804a-4f9d-9a83-bbc93d2d206d" />













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
