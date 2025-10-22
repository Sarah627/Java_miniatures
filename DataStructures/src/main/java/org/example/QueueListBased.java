package org.example;

public class QueueListBased {
    private LinkedList queue;
    QueueListBased(){
        queue = new LinkedList();
    }

    void enqueue(int value){
        queue.append(value);
    }

    int dequeue(){
        int element = queue.first();
        queue.removeAt(0);
        return element;
    }

    int size(){
        return queue.size();
    }

    boolean isEmpty(){
        return queue.isEmpty();
    }

}
