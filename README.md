# kotlin-mst-telecom

This project is a Kotlin-based command-line application that calculates the **Minimum Spanning Tree (MST)** using **Kruskal’s Algorithm** to connect European capital cities with the shortest possible total cable length. It was developed as part of a university coursework project to demonstrate both **object-oriented** and **functional programming** principles in Kotlin.

---

## Project Purpose

A telecom company is planning to connect all European capitals with fibre optic cables while minimizing infrastructure costs. The application solves this by:
- Reading edge data (cities and distances) from a file
- Constructing a graph with nodes and weighted edges
- Using Kruskal’s Algorithm and the Union-Find data structure to generate an MST

---

## Key Features

- ✅ CLI input for graph file selection
- ✅ Custom graph and edge class implementation
- ✅ Efficient **Union-Find** structure with path compression and union by rank
- ✅ Pure **Kotlin solution** using `data` classes and lambdas
- ✅ Functional and OOP blend for modularity and clarity
- ✅ Simple CLI output for MST results
- ✅ Uses real-world data (`Capitals.txt`) for edge weights

---

## Algorithms & Concepts Used

- **Kruskal’s Algorithm** – greedy algorithm for MSTs
- **Union-Find (Disjoint Set)** – with optimizations
- **Graph Theory**
- **Data Validation and Deduplication**
- **Functional Constructs** – `forEach`, `sortBy`, `data class`, lambda expressions

---
