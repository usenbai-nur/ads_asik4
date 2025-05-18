Assignment 4 – Graph Algorithms: BFS and Dijkstra's Algorithm

Overview

This project implements two fundamental graph algorithms using Java:

Breadth-First Search (BFS): Traverses the graph level by level, starting from a specified source vertex.

Dijkstra's Algorithm: Computes the shortest path from a source vertex to all other vertices in a weighted graph.

The implementation utilizes custom classes to represent the graph structure and perform the algorithms.

Features

Vertex Class

Represents a node in the graph.

Stores data and a map of adjacent vertices with corresponding edge weights.

WeightedGraph Class

Manages the collection of vertices.

Allows adding vertices and edges with specified weights.

Provides access to vertices and their connections.

BreadthFirstSearch Class

Implements the BFS algorithm.

Traverses the graph from a starting vertex, visiting all reachable vertices.

DijkstraSearch Class

Implements Dijkstra's algorithm.

Calculates the shortest path distances from a source vertex to all other vertices.

Main Class

Demonstrates the usage of the graph and algorithms.

Constructs a sample graph.

Executes BFS and Dijkstra's algorithm.

Outputs the results to the console.

Notes

The implementation avoids using built-in graph libraries, relying instead on custom classes.

Standard Java collections (e.g., HashMap, HashSet, PriorityQueue) are used where appropriate.

The code is organized into separate classes for clarity and modularity.
