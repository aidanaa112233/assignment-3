Student:Tumenbai Aidana
Group:SE-2511
                                      Sorting and Searching Algorithm Analysis System
Project Overview

This project is focused on comparing the performance of different sorting and searching algorithms using Java. The main goal was to understand how algorithm efficiency changes depending on input size and structure.
In this implementation, I selected:Bubble Sort (basic sorting),Quick Sort (advanced sorting),Binary Search (searching algorithm).
The program generates arrays of different sizes, runs algorithms on them, and measures execution time using System.nanoTime().

Algorithms Description

1. Bubble Sort
Bubble Sort works by repeatedly comparing adjacent elements and swapping them if they are in the wrong order.This algorithm is simple but very slow for large datasets.

2. Quick Sort
Quick Sort uses a divide-and-conquer approach. It selects a pivot and partitions the array into smaller and larger elements, then recursively sorts them.In practice, it performs much faster than Bubble Sort.

3. Binary Search
Binary Search works only on sorted arrays. It repeatedly divides the array in half to find the target element.
Time Complexity:
O(log n)
It is very efficient compared to linear search.

Experimental Results
The program was tested on arrays of sizes:
10 (small)
100 (medium)
1000 (large)
Example output:
Array Size: 100
Bubble Sort Time:__ns
Quick Sort Time: ___ ns
Binary Search Time: ______ns

Analysis
From the results, Quick Sort consistently performed faster than Bubble Sort, especially as the array size increased. This matches the expected Big-O complexity, since O(n log n) grows much slower than O(n²).Bubble Sort was acceptable for small arrays but became extremely slow for larger inputs.Binary Search was very fast in all cases, but it requires the array to be sorted beforehand. That is why sorting is an important step before searching.Also, sorted arrays slightly improve performance for some algorithms, especially Bubble Sort (best case O(n)).

Reflection
During this assignment, I better understood the difference between simple and efficient algorithms. Before this, I knew Big-O notation theoretically, but now I can see how it actually affects runtime.One challenge was implementing Quick Sort correctly, especially the partition logic. Another difficulty was organizing the experiment structure and making sure the measurements were fair.
Conclusion
Quick Sort is significantly more efficient than Bubble Sort for large datasets. Binary Search is extremely fast but depends on sorted data.This experiment showed that choosing the right algorithm is critical for performance.

<img width="1920" height="1080" alt="photo_5440851887994377634_w" src="https://github.com/user-attachments/assets/1aa86b68-a147-425b-9a01-9b60c9258c6f" />
<img width="1920" height="1080" alt="photo_5440851887994377606_w" src="https://github.com/user-attachments/assets/f26052aa-d9fa-4b45-9493-1339eac74d9d" />
<img width="1920" height="1080" alt="photo_5440851887994377621_w" src="https://github.com/user-attachments/assets/1642e026-00a3-4f72-b625-2c986bc53048" />
<img width="1920" height="1080" alt="photo_5440851887994377622_w" src="https://github.com/user-attachments/assets/3bf1378e-31d6-49c8-a30d-52f7889a8e6e" />
<img width="1920" height="1080" alt="photo_5440851887994377623_w" src="https://github.com/user-attachments/assets/91c861c0-1015-43f2-8521-bb1f048b2589" />
<img width="1920" height="1080" alt="photo_5440851887994377624_w" src="https://github.com/user-attachments/assets/78f8b4e7-0c5b-4b46-9a07-8f592ea7d7a1" />
<img width="1920" height="1080" alt="photo_5440851887994377626_w" src="https://github.com/user-attachments/assets/211f9fe5-34a8-4e96-83f1-8edfed3a0db0" />
<img width="1920" height="1080" alt="photo_5440851887994377629_w" src="https://github.com/user-attachments/assets/51543b35-d172-451f-94df-573fd209ea12" />
<img width="1920" height="1080" alt="photo_5440851887994377630_w" src="https://github.com/user-attachments/assets/e49a0f93-002f-4919-879b-752134952fd0" />
<img width="1920" height="1080" alt="photo_5440851887994377631_w" src="https://github.com/user-attachments/assets/b44d2cd8-bfae-4dfb-a574-111ef448d585" />
<img width="1920" height="1080" alt="photo_5440851887994377634_w" src="https://github.com/user-attachments/assets/0605703d-9b2e-4629-8040-c2552c31f13e" />
