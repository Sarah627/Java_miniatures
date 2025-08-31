package org.example;


public class LinkedList {
    private Node head = null;
    int size = 0;

    public boolean isEmpty(){
        return (size == 0);
    }

    public void push(int element){
        Node node = new Node(element, head);
        head = node;
        size++;
    }

    public void append(int data){
        Node node = new Node(data, null);
        if (head == null) head = node;
        else {
            Node iterator = head;
            while (iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = node;
        }
        size++;
    }
    public void insertAt(int pos, int data){
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        Node node = new Node(data, null);
        Node iterator = head;
        if(pos == 0) {
            push(data);
            return;
        }
        for( int i = 0; i < pos-1 ; i++ ){
            iterator = iterator.next;
        }
        node.next = iterator.next;
        iterator.next = node;
        size++;
    }



}


class Node{
    int element;
    Node next;

    public Node(int data, Node n){
        element = data;
        next = n;
    }
}
