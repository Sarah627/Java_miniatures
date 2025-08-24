package org.example;

public class Stack {

    // data fields
    private int[] arr;
    private int top = -1;

    //constructor
    Stack(int size){
        arr = new int[size];
    }

    // push elements into the stack
    void push(int element){
        if(top == arr.length-1) System.out.println(" value cannot be added because of size limitations");
        else arr[++top] =element;
    }

    // pop elements out of the stack
    int pop(){
        if(isEmpty()) {
            System.out.println("the stack is empty");
            return -1;
        }
        else return arr[top--];
    }

    // returns the last added value in the stack
    int peek(){
        if(isEmpty()) {
            System.out.println("the stack is empty");
            return -1;
        }
        else return top;
    }

    // checking if the stack is empty

    boolean isEmpty(){
        return (top==-1);
    }

    int size(){
        return top+1;
    }

}
