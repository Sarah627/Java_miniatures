package org.example;

public class Queue {
    //implementation #1

    private final int[] data;
    private int front = -1;
    private int rear = -1;

    public Queue (int size){
        data = new int[size];
    }

    public boolean isEmpty(){
        return (front == -1 & rear==-1);
    }

    public boolean isFull(){
        return (rear == data.length - 1);
    }

    public void enqueue(int element){
        if(isEmpty()) {
            front++;
            data[++rear]=element;
        }else if(isFull()){
            throw new IllegalStateException("Queue is Full");
        }
        else{
            data[++rear]=element;
        }
    }

    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        else if (rear == front) {
            int value = data[front];
            rear =-1;
            front =-1;
            return value;
        }
        else {
            return data[front++];
        }
    }


    int size(){
        return data.length;
    }






// implementation #2

//    private int[] data;
//    private int front = 0;
//    private int rear=-1;
//
//    public Queue (int size){
//        data = new int[size];
//    }
//
//    public void enqueue(int element){
//        if(isFull()) throw new IllegalStateException("queue is full");
//        data[++rear]=element;
//    }
//
//    public int dequeue(){
//        if(isEmpty()) throw new IllegalStateException("queue is empty");
//        return data[front++];
//    }
//
//
//    public boolean isEmpty(){
//        return (front > rear);
//    }
//
//    public boolean isFull(){
//        return (rear == data.length - 1);
//    }
}


