package org.example;

import java.util.Iterator;

public class GenericArrayBasedStack<T>  {

    private T[] array;
    private int top = -1;
    private static final int SIZE =1000;

    public GenericArrayBasedStack(){
        this(SIZE);
    }
    public GenericArrayBasedStack(int size){
        array= (T[]) new Object[size];
    }

    public int size(){
        return top+1;
    }

    public T top(){
        if(isEmpty()) throw new IllegalStateException("Stack is empty");;
        return array[top];
    }

    public void push(T item){
        if(size() == array.length) throw new IllegalStateException("Stack is full");;
        array[++top] = item;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public T pop(){
        if(isEmpty()) throw new IllegalStateException("Stack is empty");;
        return (T) array[top--];
    }




}
