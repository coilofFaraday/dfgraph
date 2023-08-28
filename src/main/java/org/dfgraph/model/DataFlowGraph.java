package org.dfgraph.model;

import java.util.HashSet;
import java.util.Set;

public class DataFlowGraph {

    private Set<Node> nodes;
    private Set<Edge> edges;

    public DataFlowGraph() {
        this.nodes = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public Set<Edge> getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        return "DataFlowGraph{" +
                "nodes=" + nodes +
                ", edges=" + edges +
                '}';
    }
}
