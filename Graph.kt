package domain

import java.io.File
import algorithm.KruskalsAlgorithm
import algorithm.UnionFind  // Ensure this import is correct

class Graph {
    private val edges = mutableListOf<Edge>()
    private val unionFind = UnionFind()  // Initialize UnionFind here

    fun loadEdges(filePath: String) {
        File(filePath).forEachLine { line ->
            val parts = line.split(", ")
            if (parts.size == 3) {
                edges.add(Edge(parts[0], parts[1], parts[2].toInt()))
                unionFind.addNode(parts[0])  // Initialize node in UnionFind
                unionFind.addNode(parts[1])  // Initialize node in UnionFind
            }
        }
    }

    fun calculateMST(): MSTResult {
        return KruskalsAlgorithm().apply(edges)
    }
}
