package org.example;

public class GenericArrayBasedQueue <T> {
    private T[] data;
    private int rear = -1;
    private int front = 0;

    public GenericArrayBasedQueue(int size){
        data = (T[]) new Object[size];
    }

    public boolean isEmpty(){
        return (front> rear);
    }
    public boolean isFull(){
        return (rear == data.length - 1);
    }

    public void enqueue(T element){
        if(isFull()) throw new IllegalStateException("teh queue is full");
        data[++rear] = element;
    }

    public T dequeue(){
        if(isEmpty()) throw new IllegalStateException("the Queue is empty");
        return data[front++];
    }
}
