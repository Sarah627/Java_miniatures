package org.example;

public class LinkedList {
    static class Node{
        int element;
        Node next;

        public Node(int data, Node n){
            element = data;
            next = n;
        }
    }

    private Node head = null;
    private int size = 0;

    public boolean isEmpty(){
        return (size == 0);
    }

    public void insertFirst(int element){
       head = new Node(element, head);
       size++;

    }

    public void append(int data){
        Node node = new Node(data, null);
        if (head == null) {
            insertFirst(data);
        }
        else {
            Node iterator = head;
            while (iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = node;
            size++;
        }
    }
    public void insertAt(int pos, int data){
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if(pos == 0) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data, null);
        Node iterator = head;
        for( int i = 0; i < pos-1 ; i++ ){
            iterator = iterator.next;
        }
        node.next = iterator.next;
        iterator.next = node;
        size++;
    }

    void removeAt(int pos){
        Node nodeToRemove = head;
        if(isEmpty() || pos < 0 || pos>=size) return;
        if(pos == 0) {
            head=head.next;
            nodeToRemove.next=null;
            size--;
            return;
        }
        Node iterator = head;
        for( int i = 0; i < pos-1 ; i++ ){
            iterator = iterator.next;
        }
        nodeToRemove = iterator.next;
        iterator.next = nodeToRemove.next;
        nodeToRemove.next=null;
        size--;

    }

    void removeElement(int element){
        Node nodeToRemove = head;

        if(isEmpty()) return;
        if(head.element ==element) {
            head=head.next;
            nodeToRemove.next=null;
            size--;
            return;
        }

        Node iterator = head;

        while(iterator.next!= null && iterator.next.element !=element ){
            iterator = iterator.next;
        }
        if(iterator.next==null) return;

        nodeToRemove = iterator.next;
        iterator.next = nodeToRemove.next;
        nodeToRemove.next=null;
        size--;

    }

    int size(){
        return size;
    }



}


