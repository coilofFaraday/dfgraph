package org.dfgraph.model;

public class Edge {

    private Node source; // Starting point of the edge
    private Node target; // Ending point of the edge

    public Edge(Node source, Node target) {
        this.source = source;
        this.target = target;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }
}
