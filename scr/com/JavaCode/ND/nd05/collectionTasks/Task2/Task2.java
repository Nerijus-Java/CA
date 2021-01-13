package com.JavaCode.ND.nd05.collectionTasks.Task2;

public class Task2 {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");

        System.out.println("Size :" + myLinkedList.getSize());
        System.out.println();
        System.out.println(myLinkedList.printList());
    }
}
