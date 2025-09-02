package org.example;

public class GenericLinkedList<T> {
    static class Node<T>{
        T element;
        Node<T> next;
        Node(T element, Node<T> next){
            this.element=element;
            this.next = next;
        }
    }

    private Node<T> head = null;
    private int size = 0;


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size ==0);
    }

    public void insert(T element){
        head = new Node<>(element,head);
        size++;
    }

    public void insertAt(int pos, T element){
        if(pos > size || pos < 0) return;

        if (pos == 0){
            head = new Node<>(element, null);
            size++;
            return;
        }

        Node<T> newNode = new Node<>(element, null);
        Node<T> iterator = head;
        for(int i =0; i< pos - 1; i++){
            iterator=iterator.next;
        }
        newNode.next=iterator.next;
        iterator.next=newNode;
        size++;

    }

    public void removeAt(int pos){
        if(pos > size || pos < 0) return;

        Node<T> nodeToRemove = head;

        if(isEmpty()) return;

        if (pos == 0){
         head = head.next;
         nodeToRemove.next=null;
         size--;
        }

        Node<T> iterator = head;
        for(int i =0; i< pos - 1; i++){
            iterator=iterator.next;
        }
        nodeToRemove=iterator.next;
        iterator.next=nodeToRemove.next;
        nodeToRemove.next=null;
        size--;

    }

}
