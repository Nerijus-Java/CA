package com.JavaCode.ND.nd05.collectionTasks.Task2;

public class MyLinkedList {

    private Node nodeNow;

    public MyLinkedList() {
    }

    public void add(String s){
        Node newNode;
        if (nodeNow == null){
            nodeNow = new Node(null,null,s,1);
        } else {
            moveToLastNode();
            newNode = new Node(null,nodeNow,s,nodeNow.getKey() + 1);
            nodeNow.setNextNode(newNode);
        }
    }

    public int getSize(){
        moveToLastNode();
        return nodeNow.getKey();
    }

    public String printList(){
        String holder = "[";
        if (nodeNow != null){
            moveToFirstNode();
            while(!nodeNow.isNextNodeEmpty()){
                holder += nodeNow.toString() + " ,";
                nodeNow = nodeNow.getNextNode();
            }

        }
        String nodeNowString = nodeNow.toString() + "]";
        holder += nodeNowString;
        return holder;
    }

    private void moveToLastNode(){
        while (!nodeNow.isNextNodeEmpty()){
            nodeNow = nodeNow.getNextNode();
        }
    }

    private void moveToFirstNode(){
        while(!nodeNow.isLastNodeEmpty()){
            nodeNow = nodeNow.getLastNode();
        }
    }

}
