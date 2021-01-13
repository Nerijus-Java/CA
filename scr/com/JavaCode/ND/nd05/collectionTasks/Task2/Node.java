package com.JavaCode.ND.nd05.collectionTasks.Task2;

public class Node {

    private Node nextNode;
    private Node lastNode;
    private String value;
    private int key;

    public Node(Node nextNode, Node lastNode, String value, int key) {
        this.nextNode = nextNode;
        this.lastNode = lastNode;
        this.value = value;
        this.key = key;
    }

    public boolean isNextNodeEmpty(){
        return this.nextNode == null;
    }

    public boolean isLastNodeEmpty(){
        return this.lastNode == null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return value;
    }
}
