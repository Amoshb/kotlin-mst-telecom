package algorithm

class UnionFind {
    private val parent = mutableMapOf<String, String>()
    private val rank = mutableMapOf<String, Int>()

    fun find(item: String): String {
        parent.putIfAbsent(item, item)  // Ensure the item is initialized if not present
        if (item != parent[item]) {
            parent[item] = find(parent[item]!!)
        }
        return parent[item]!!
    }

    fun union(root1: String, root2: String): Boolean {
        val rootX = find(root1)
        val rootY = find(root2)

        if (rootX != rootY) {
            when {
                rank.getOrDefault(rootX, 0) < rank.getOrDefault(rootY, 0) -> parent[rootX] = rootY
                rank.getOrDefault(rootX, 0) > rank.getOrDefault(rootY, 0) -> parent[rootY] = rootX
                else -> {
                    parent[rootY] = rootX
                    rank[rootX] = rank.getOrDefault(rootX, 0) + 1
                }
            }
            return true
        }
        return false
    }

    // Method to initialize each node before using the UnionFind structure
    fun addNode(node: String) {
        parent.putIfAbsent(node, node)
        rank.putIfAbsent(node, 0)
    }
}
