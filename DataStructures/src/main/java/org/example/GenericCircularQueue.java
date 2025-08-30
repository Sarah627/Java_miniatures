package org.example;

public class GenericCircularQueue<T> {

    private final T[] data;
    private int rear = -1;
    private int front = -1;

    public GenericCircularQueue(int size) {
        data = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
        return ((rear + 1) % data.length == front);
    }

    public void enqueue(T element) {
        if (isEmpty()) {
            front = 0;}
        if (isFull()) {
            throw new IllegalStateException("the queue is full");
        }
        rear = (rear + 1) % data.length;
        data[rear] = element;

    }

    public T dequeue() {
        T value;
        if (!isEmpty()) {
            value = data[front];
        }if (rear == front) {
            front = rear = -1;
        }
        return value;

    }
}
