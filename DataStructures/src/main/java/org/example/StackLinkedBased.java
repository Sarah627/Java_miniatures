package org.example;

public class StackLinkedBased {
    private LinkedList stack;
    StackLinkedBased(){
        stack = new LinkedList();
    }

    int size(){
        return stack.size();
    }
    boolean isEmpty(){
        return  stack.isEmpty();
    }

    void push(int item){
        stack.insertFirst(item);
    }

    int pop(){
        if(stack.isEmpty()) throw new RuntimeException("The stack is empty");
        int element = stack.first();
        stack.removeAt(0);
        return element;
    }

    int first(){
        return stack.first();
    }

}
