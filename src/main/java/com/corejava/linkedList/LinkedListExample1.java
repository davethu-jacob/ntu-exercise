package com.corejava.linkedList;

public class LinkedListExample1 {
    Node head;

    // Constructor to create an empty linked list
    public LinkedListExample1() {
        this.head = null;
    }

    // Method to add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // traverses to the last node
            }
            current.next = newNode; // add the new new node to the end of the list
        }
    }

    public void addAfter(int insertAfter, int data) {
        Node current = head;
        while (current.next != null) {
            if (current.data == insertAfter) {
                Node newNode = new Node(data);

            }
        }
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListExample1 myList = new LinkedListExample1();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        myList.printList();
    }

}

// Node class represents an individual element in the linked list
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
