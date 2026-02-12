# lad 1 and 2 
lad 2:

# 📘 DFS Traversal Using Adjacency Matrix (C)

## 🔹 Description
This project demonstrates the implementation of **Depth First Search (DFS)** traversal on a graph using an **adjacency matrix** in C.  
The user provides the number of vertices and the adjacency matrix as input. The program then performs DFS starting from a given starting node and prints the order of visited nodes.

This implementation uses a **stack-based approach (DFS array)** instead of recursion and a **visited array (newnode)** to ensure that each node is visited only once.

---

## 🔹 Objectives
- Traverse a graph depth-wise using DFS  
- Visit all reachable vertices from a starting node  
- Understand adjacency matrix representation of graphs  
- Learn stack-based implementation of DFS  
- Analyze time and space complexity of DFS  

---

## 🔹 How It Works
1. The user inputs the number of nodes (N).  
2. The adjacency matrix of size N × N is taken as input.  
3. The user provides a starting node.  
4. DFS traversal is performed using a stack.  
5. Each visited node is printed in traversal order.  

---
<img width="220" height="121" alt="image" src="https://github.com/user-attachments/assets/b14c5b13-5abe-4a48-b921-6e410921a804" />
<img width="261" height="135" alt="image" src="https://github.com/user-attachments/assets/4c4f0007-0714-47e0-a520-52e860e6d252" />

## 🔹 Input Format
- Number of nodes (N)  
- Adjacency matrix (N × N)  
- Starting node (0-based index)
<img width="352" height="115" alt="image" src="https://github.com/user-attachments/assets/d2043b2b-85f0-473f-ad9e-7cd8f9b15765" />
<img width="230" height="125" alt="image" src="https://github.com/user-attachments/assets/6be44fae-5fd4-45b9-a2ca-5dd28e18d402" />


---

## 🔹 Output
- Prints the adjacency matrix  
- Prints DFS traversal order  

**Example Output:**

<img width="162" height="38" alt="image" src="https://github.com/user-attachments/assets/c02e54c2-8e3f-45d9-9108-c50aa6eeb4ee" />
<img width="156" height="38" alt="image" src="https://github.com/user-attachments/assets/f9e85556-d2cf-4bb3-801d-0a6d5585253e" />


---

## 🔹 Time & Space Complexity
- **Time Complexity:** O(V²)  
- **Space Complexity:** O(V² + V)  

---

## 🔹 Limitations
- Not suitable for very large or sparse graphs  
- Uses fixed-size arrays  
- Input must be valid (0 or 1 in adjacency matrix)  

---

## 🔹 Tools & Language
- **Language:** C  
- **Compiler:** GCC / Online C Compiler  

---

## 🔹 Conclusion
This project provides a simple and beginner-friendly implementation of DFS using an adjacency matrix. It is helpful for understanding basic graph traversal and stack-based DFS logic. For better performance on large graphs, adjacency list representation is recommended.


