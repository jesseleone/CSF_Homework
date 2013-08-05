/**
 * Recursion
 *
 * Recursive function - calls itself
 *
 * Key things that recursive functions have
 *  - Base case
 *      - Usually if/ifelse statements (usually returns something)
 *  - Recursive step(s)
 *
 * InOrderTraversal(Node n)
 * {
 *     If(n==null) return;          <------Base case
 *     InOrderTraversal(n.left);    <------else
 *     Print n.value;
 *     InOrderTraversal(n.right);
 * }
 *
 * Performance for fibonacci problem is slow because recursion would yield n^2 complexity
 *
 * Graphs
 *
 * Directed vs Undirected
 * Directed - one way relationship (ex binary search tree)
 * Undirected - potentially two way relationship
 *
 * Weighted vs Non Weighted
 * Weighted: when some paths more expensive than others (different costs for different edges)
 *
 * Simple vs Non-simple
 * Non-simple: When multiple paths/relationships exist between nodes or when paths refer to the same node it was referred from
 *
 * Sparse vs Dense
 * Sparse: has unconnected nodes
 * Dense: all nodes connected
 *
 * Cyclic vs Acyclic
 * Cyclic: has loop
 * Acyclic (ex. binary search tree)
 *
 * Embedded/Topological
 * Embedded: has notion of coordinates for display
 *
 * Implicit vs Explicit
 * explicit:Built before we need it
 * implicit:Built as you're computing
 *
 * Labeled vs unlabeled
 * labeled: data stored goes beyond relationship between nodes
 *
 * DAG
 */
