package org.example;

public class DoublyLinkedList {

    private static class Node{
        int element;
        Node prev;
        Node next;

        Node(Node prev, int element, Node next){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head = null;
    private int size = 0;

    public boolean isEmpty(){
        return (size == 0);
    }

    public void insertFirst(int element){
        Node newNode =  new Node(null, element,null);
        if (!isEmpty()) {
            newNode.next = head;
            head.prev = newNode;
        }
        head =  newNode;
        size++;
    }

    public void append(int data){

        if (head == null) {
            insertFirst(data);
        }
        else {
            Node iterator = head;
            while (iterator.next != null){
                iterator = iterator.next;
            }

            iterator.next = new Node(iterator,data, null);

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
        Node iterator = head;
        for( int i = 0; i < pos; i++ ){
            iterator = iterator.next;
        }
        Node newNode = new Node(iterator.prev,data, iterator);
        iterator.prev.next=newNode;
        iterator.prev = newNode;
        size++;
    }

    void removeAt(int pos){
        if(isEmpty() || pos < 0 || pos>=size) return;
        if(pos == 0) {
            head=head.next;
            if (head != null) head.prev = null;
            size--;
            return;
        }
        Node iterator = head;
        for( int i = 0; i != pos && iterator.next!=null ; i++ ){
            iterator = iterator.next;
        }
        iterator.prev.next = iterator.next;
        if(iterator.next != null) iterator.next.prev = iterator.prev;
        size--;

    }

    void removeElement(int element){
        if(isEmpty()) return;
        Node nodeToRemove = head;
        if(head.element == element) {
            head=head.next;
            if(head != null) head.prev=null;
            nodeToRemove.next=null;
            size--;
            return;
        }

        Node iterator = head;

        while(iterator != null && iterator.element != element){
            iterator = iterator.next;
        }
        if(iterator == null) return;
        iterator.prev.next = iterator.next;
        if(iterator.next!=null)  iterator.next.prev = iterator.prev;

        size--;

    }

    int size(){
        return size;
    }
}
