/**
 * Created with IntelliJ IDEA.
 * User: Home
 * Date: 7/22/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
/*
Class notes:

Advanced data structures

MAPS

Collections of "keys" and "values"
Let you query, add, remove
Key is an object and is unique among set of keys
Value is an object, associated with a key. In most implementations, a key is associated with one value
Generally, unordered

Hashmap/hashtable
- Array based
- Where to put in array? Uses hash function (takes in something that is variable size and returns something fixed size)
- Array-backed solution can perform operations in O(1) as they use arrays as their backing store
- Hash maps has the key, mod the results by the number of buckets, then insert at that position
- Hasmap hash methods should evenly distribute objects across their buckets
- Writing good has methods is hard, and lots of examples exist
- Very few situations where you need to write your own
- Rehash is when hash table has to be rewritten due to adding beyond existing size
    - Rehash method 1: loop through all of the underlying array
    - Rehash method 2: incremental: create new array and insert only when objects are queried
- Hash functions seek to evenly distribute their hash values
- Dealing with collisions
    - Chaining: using linked lists at particular placeholders
    - Open addressing: continues looking through the list for the next open item


Tree map
- tree backed solution for maps

SETS



GRAPHS

Higher level
More complex
- Can have one to one, one to many, many to many
- nodes represent values in graph
Graphs are made up of nodes and edges
- edges represent the connections between nodes
- multiple ways to store relationships
- Graphs can be directed (if x is connected to y, Y is reachable from X, not the converse)(twitter follower)
- Graphs can be undirected (if x is connected to y, they are reachable through one another)(facebook friend)
Trees can be thought of as special case of a directed graph
How to model nodes and edges
    if no data is stored in edges
    -Adjacency list  - can store A list of N nodes, where each node has a list of nodes it is adjacent to
    -Adjacency matrix, A NxN array where one axis represents source and the other destination. Values in the matrix indicate connections
    if data is stored in edges
    - Incidence list - A list of N nodes and M edges, where each node keeps a list of the edges, and each edge keeps a list of its nodes
    - Incidence matrix - A NxM array where a value at a row/column means that node is associated with that edge
 */
public class Application {
}
