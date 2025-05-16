package algorithm

import domain.Edge
import domain.MSTResult
import algorithm.UnionFind  // Make sure UnionFind is in the domain package or correct the import according to its actual package

class KruskalsAlgorithm {
    fun apply(edges: MutableList<Edge>): MSTResult {
        edges.sortBy { it.distance }  // This should work if edges is a MutableList
        val unionFind = UnionFind()
        val result = mutableListOf<Edge>()
        var totalDistance = 0

        for (edge in edges) {
            if (unionFind.union(edge.start, edge.end)) {  // Ensure union method is correctly implemented and accessible
                result.add(edge)
                totalDistance += edge.distance
            }
        }

        return MSTResult(result, totalDistance)
    }
}
