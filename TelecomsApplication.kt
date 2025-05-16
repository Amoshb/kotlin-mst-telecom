package ui

import domain.Graph
import java.util.Scanner  // Import Scanner for user input

class TelecomsApplication {
    fun run() {
        // Create a Scanner object for reading input from the standard input stream
        val scanner = Scanner(System.`in`)

        // Prompt the user for the file path
        println("Please enter the path to the Capitals data file:")
        val filePath = scanner.nextLine()  // Read the file path from the user

        val graph = Graph()
        graph.loadEdges(filePath)  // Load the edges from the specified file
        val mst = graph.calculateMST()  // Calculate the minimum spanning tree (MST)

        // Print the results
        println("Minimum Spanning Tree (MST) Total Distance: ${mst.totalDistance}")
        mst.edges.forEach {
            println("Edge from ${it.start} to ${it.end} with distance ${it.distance}")
        }
    }
}
