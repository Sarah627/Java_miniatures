package org.example;

public class PQBinaryHeap<T extends Comparable<T>> {

    T[] heap;
    int size;

    public PQBinaryHeap (int capacity){
        heap = (T[]) new Object[capacity+1];
        this.size =0;
    }





}
