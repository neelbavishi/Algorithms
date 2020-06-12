package com.interview.datastructures.Graph;

public interface DFSVisitor<T> {
	  /**
	   * Called by the graph traversal methods when a vertex is first visited.
	   * 
	   * @param g -
	   *          the graph
	   * @param v -
	   *          the vertex being visited.
	   */
	  public void visit(GraphImpl<T> g, Vertex<T> v);

	  /**
	   * Used dfsSpanningTree to notify the visitor of each outgoing edge to an
	   * unvisited vertex.
	   * 
	   * @param g -
	   *          the graph
	   * @param v -
	   *          the vertex being visited
	   * @param e -
	   *          the outgoing edge from v
	   */
	  public void visit(GraphImpl<T> g, Vertex<T> v, Edge<T> e);
	}
