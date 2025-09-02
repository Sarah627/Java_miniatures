package org.example;

public class GenericDoubleLinkedList <T>{
    static class Node<T>{
        T element;
        Node<T> next;
        Node<T> prev;

        public Node(T element, Node<T> next, Node<T> prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }


    


}
