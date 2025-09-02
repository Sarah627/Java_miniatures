package org.example;

public class CircularLinkedList <T> {
    static class Node<T>{
        T element;
        Node<T> next;

        public Node(T element, Node<T> next){
            this.element = element;
            this.next = next;
        }
    }
    private Node<T> tail = null;
    private int size = 0;

    public boolean isEmpty(){
        return (size == 0);
    }

    public void insert(T element){
        if(isEmpty()){
            tail = new Node<>(element,null);
            tail.next=tail;
        }else{
            tail.next = new Node<>(element,tail);
        }
        size++;
    }

    public void remove(T element){
        if(isEmpty()){
            return;
        }
        Node<T> head = tail.next;
        if(head == tail) tail = null;
        else{
            tail.next = head.next;
        }
        size--;
    }



    public void rotate(){
        if(tail != null){
            tail=tail.next;
        }
    }






}
