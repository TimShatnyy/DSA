# General

This repository is meant as contribution to studying data structures and algorithms basics. For now all the code is made in Java.
<br /> <br />
Codes are taken from many resources and collected here. Mostly the code comes from the [geeksforgeeks.org](https://www.geeksforgeeks.org/) and [W3school](https://www.w3schools.com/). 
<br /> <br />
**Recommended further resources to study:** <br />
https://www.w3schools.com/dsa/index.php <br />
https://www.geeksforgeeks.org/dsa/dsa-tutorial-learn-data-structures-and-algorithms/ <br />
Amazing playlist about all algorithms under ~5 minutes: https://youtube.com/playlist?list=PL9xmBV_5YoZPKwb4XPB1sG7S6kNpN9JJo&si=efVetsNVzbKFsFcd <br />
Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein - Introduction to Algorithms (book)

# Runtime tables

## Algorithms
### Search 

| Algorithm     | Time        |
| ------------- | ----------- |
| Linear Search | $O(n)$      |
| Binary Search | $O(\log n)$ |

### Sort 

| Algorithm      | TIme                                                          | Swaps         | Memory | In-place |
| -------------- | ------------------------------------------------------------- | ------------- | ------ | -------- |
| [Bubble Sort](BubbleSort.java)    | $O(n^2)$                                                      | $O(n^2)$      | $O(1)$ | Yes      |
| Selection sort | $O(n^2)$                                                      | $O(n)$        | $O(1)$ | Yes      |
| Insertion Sort | $O(n \ log \ n)$                                              | $O(n^2)$      | $O(1)$ | Yes      |
| Merge Sort     | $O(n \log n)$                                                 | $O(n \log n)$ | $O(n)$ | No       |
| Quicksort      | $O(n^2)$ - sorted input<br><br>$O(n \ log \ n)$ - rand. input |               | $O(1)$ | Yes      |
| Heapsort       | $O (n \ log \ n)$                                             |               | $O(1)$ | Yes      |

### Dynamic Programming
$n$ - input array length

| Algorithm / Problem                                                                    | Time                                | Memory                                                               |
| -------------------------------------------------------------------------------------- | ----------------------------------- | -------------------------------------------------------------------- |
| Fibonacci Numbers                                                                      | $O(n)$                              | $O(n)$<br><br>Optimised: <br>$O(1)$                                  |
| Jump Game                                                                              | $O(n)$                              |                                                                      |
| Longest Common Subsequence<br>($m$ - length of string 1)<br>($n$ - length of string 2) | $O(m\cdot n)$                       |                                                                      |
| Edit distance<br>($m$ - length of string 1)<br>($n$ - length of string 2)              | $O(m\cdot n)$<br>                   |                                                                      |
| Subset sum                                                                             | $O(n \cdot sum)$ (pseudopolynomial) | $\Theta(m\cdot n)$<br><br>Optimised: <br>$\Theta(n)$  or $\Theta(m)$ |
| Knapsack 0-1 (2D)<br>($W$ - knapsack capacity)                                         | $O(n\cdot W)$<br>                   | $O(n\cdot W)$<br><br>Optimised: $O(n\cdot W/K)$                      |
| Longest Ascending Subsequence                                                          | $O(n^2)$                            |                                                                      |
| Matrix Chain Multiplication                                                            | $O(n^3)$                            |                                                                      |


### Graphs
$V = n$ (number of vertices $\lvert V \rvert$) 
$E = m$ (number of edges $\lvert E \rvert$)

| Algorithm            | Time                                                                                                                        |
| -------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| DFS                  | $O(V + E)$                                                                                                                  |
| BFS                  | $O(V + E)$                                                                                                                  |
| Topological Sort     | $O(V + E)$                                                                                                                  |
| Dijsktra             | $O((E+V)\log V)$                                                                                                            |
| Borůvka (MST)        | $O(E \ \log \ V)$                                                                                                           |
| Kruskal              | $O(E \ \log \ E)$ or $O(E \ \log \ V)$                                                                                      |
| Prim                 | Binary heap: <br>$O(E \ \log \ V)$<br><br>Fibonacci heap: <br>$O(E + V \log \ V)$<br><br>Matrix: <br>$O(V^2)$               |
| Bellman-Ford         | $O(V\cdot E)$                                                                                                               |
| Floyd-Warshall       | $O(V^3)$                                                                                                                    |
| Johnson              | Using binary-heap Dijkstra:<br>$O(V(E+V)\log V)$                                                                            |
| Matrixmultiplikation | Standard:<br>$O(n3)$<br><br>It. squaring:<br>$O(n^3 \log n)$<br><br>With Strassen:<br>$O(n^{\log_2 7})\approx O(n^{2.807})$ |

### Selection

| Algorithm         | Runtime |
| ----------------- | ------- |
| Median-of-medians | $O(n)$  |


## Datastructures
ADT - Abstract Data Types

### ADT List
$l$ - length

| Implementation     | $\text{insert}(k,L)$ (at end)  | $\text{get}(i,L)$ | $\text{insertAfter}(k,k',L)$ | $\text{delete}(k,L)$ |
| ------------------ | ------------------------------ | ----------------- | ---------------------------- | -------------------- |
| Array              | $O(1)$                         | $O(1)$            | $O(l)$                       | $O(l)$               |
| Singly Linked List | $O(1)$<br>(w. ptr to last el.) | $O(l)$            | $O(1)$                       | $O(l)$               |
| Double Linked List | $O(1)$                         | $O(l)$            | $O(1)$                       | $O(1)$               |

### Stacks, Queues, and Priority Queues

| ADT            | Typical Implementation                     | Opertions              | Runtime     |
| -------------- | ------------------------------------------ | ---------------------- | ----------- |
| Stack (LIFO)   | Singly Linked List                         | `push`, `pop`, `top`   | $O(1)$ |
| Queue (FIFO)   | Singly Linked List <br>(with tail pointer) | `enqueue`, `dequeue`   | $O(1)$      |
| Priority Queue | (Max-)heap                                 | `insert`, `extractMax` | $O(\log n)$ |

### ADT Dictionary
$x$ - key, $W$ - dictionaty 

| Implementation                                     | $\text{search}(x, W)$                   | $\text{insert}(x, W)$ | $\text{delete}(x, W)$ |
| -------------------------------------------------- | --------------------------------------- | --------------------- | --------------------- |
| Unsorted Array                                     | $O(n)$                                  | $O(1)$                | $O(n)$                |
| Sorted Array                                       | $O(\log n)$                             | $O(n)$                | $O(n)$                |
| Doubly Linked List                                 | $O(n)$                                  | $O(1)$                | $O(n)$                |
| Naive Binary Search Tree<br>($h$ - height of tree) | $O(h)$ <br>(up to $O(n)$ if unbalanced) | $O(h)$                | $O(h)$                |
| 2-3 Tree                                           | $O(\log n)$                             | $O(\log n)$           | $O(\log n)$           |
| AVL Tree                                           | $O(\log n)$                             | $O(\log n)$           | $O(\log n)$           |


