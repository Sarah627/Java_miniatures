package org.example;

public class DoublyLinkedList {

    private static class Node{
        int element;
        Node prev;
        Node next;

        Node(int element, Node next, Node prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
