package org.dfgraph.model;

public class Node {

    private String identifier; // Unique identifier for the node, e.g., variable name, method name, etc.
    private NodeType type;     // Type of the node (VARIABLE, METHOD, CLASS, etc.)

    public Node(String identifier, NodeType type) {
        this.identifier = identifier;
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return identifier.equals(node.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    @Override
    public String toString() {
        return "Node{" +
                "identifier='" + identifier + '\'' +
                ", type=" + type +
                '}';
    }

    public enum NodeType {
        VARIABLE,
        METHOD,
        CLASS
        // ... other types as needed
    }
}
