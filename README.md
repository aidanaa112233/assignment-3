                                  
Name:Tumenbai Aidana
Group:SE-2511
# Graph Traversal and Dijkstra Algorithm Project
<img width="1920" height="1080" alt="photo_5226785302007978649_w" src="https://github.com/user-attachments/assets/50184396-8a25-4610-830c-58db9853473d" />
<img width="1920" height="1080" alt="photo_5226785302007978650_w" src="https://github.com/user-attachments/assets/c6f55335-bdd3-47b6-a1fe-521e7d42e9c9" />
<img width="1920" height="1080" alt="photo_5226785302007978651_w" src="https://github.com/user-attachments/assets/012d4c58-8257-46d2-9514-f6c5531442bd" />
<img width="1920" height="1080" alt="photo_5226785302007978652_w" src="https://github.com/user-attachments/assets/e056b1d7-572e-417a-980e-272de7c605e9" />
<img width="1920" height="1080" alt="photo_5226785302007978653_w" src="https://github.com/user-attachments/assets/acdf050d-cc80-4230-bb97-67359b727923" />
<img width="1920" height="1080" alt="photo_5226785302007978654_w" src="https://github.com/user-attachments/assets/2fcb1b3a-8c68-45d0-8b38-3aa41de9f256" />
<img width="1920" height="1080" alt="photo_5226785302007978655_w" src="https://github.com/user-attachments/assets/4caff598-1e14-4407-b197-32f7ef69f901" />
<img width="1920" height="1080" alt="photo_5226785302007978656_w" src="https://github.com/user-attachments/assets/9a775161-83cb-4e5f-b65f-969f58791ef7" />
<img width="1920" height="1080" alt="photo_5226785302007978657_w" src="https://github.com/user-attachments/assets/115539d9-9478-416c-96a1-a68a1d95593b" />
<img width="1920" height="1080" alt="photo_5226785302007978658_w" src="https://github.com/user-attachments/assets/e7762207-cbc4-4304-af0e-52310095a181" />
<img width="1920" height="1080" alt="photo_5226785302007978659_w" src="https://github.com/user-attachments/assets/beb6c764-0e50-4ef8-acd2-504a66270d6c" />
<img width="1920" height="1080" alt="photo_5226785302007978660_w" src="https://github.com/user-attachments/assets/f850a845-d479-4ebf-90a8-25faa08e3317" />
<img width="1920" height="1080" alt="photo_5226785302007978661_w" src="https://github.com/user-attachments/assets/a3db9878-80e2-4bfc-a227-9895f9bed0d8" />
<img width="1920" height="1080" alt="photo_5226785302007978662_w" src="https://github.com/user-attachments/assets/cd0ccd13-3de4-4d58-9895-16a06a029cc8" />
<img width="1920" height="1080" alt="photo_5226785302007978663_w" src="https://github.com/user-attachments/assets/80e08820-10eb-46be-8606-ff283269ae84" />
<img width="1920" height="1080" alt="photo_5226785302007978664_w" src="https://github.com/user-attachments/assets/26cf84ac-c2bf-46ea-8b34-79ab5c04acd4" />













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
