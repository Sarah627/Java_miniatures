package org.example;

public class CircularQueue {

    private final int[] data;
    private int front = -1;
    private int rear = -1;

    public CircularQueue (int size){
        data = new int[size];
    }

    public boolean isEmpty(){
        return (front == -1 & rear==-1);
    }

    public boolean isFull(){
        return ((rear+1)% data.length == front);
    }

    public void enqueue(int element){
        if(isEmpty()) {
            front++;
        }
        if(isFull()){
            throw new IllegalStateException("Queue is Full");
        }
        rear = (rear+1)% data.length;
        data[rear]=element;

    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        int value = data[front];
        if (rear == front) {
            rear = front = -1;
            return value;
        }
        front = (front+1)% data.length;
        return value;

    }

}
