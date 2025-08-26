package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Stack pages = new Stack(5);

        // trying some operations

        pages.push(5);
        pages.push(8);
        pages.push(9);
        pages.push(3);

        System.out.println(pages.pop()); //prints out 3 because it's the last element

        System.out.println(pages.peek());
        System.out.println(pages.pop());
        System.out.println(pages.pop());
        System.out.println(pages.pop());
        System.out.println(pages.isEmpty());

        //testing if the stack is safe

        System.out.println(pages.pop());
        // test 2
        pages.push(5);
        pages.push(8);
        pages.push(9);
        pages.push(3);
        pages.push(0);
        pages.push(4);


        //trying generic stack implementation
        //creating object first (two different constructors)

        GenericArrayBasedStack<Integer> numberStack = new GenericArrayBasedStack<>(10);
        GenericArrayBasedStack<Integer> numberStack2 = new GenericArrayBasedStack<>();


        numberStack.push(5);
        numberStack.push(9);
        numberStack.push(0);
        numberStack.push(2);
        numberStack.push(3);
        numberStack.push(8);
        numberStack.push(4);
        numberStack.push(1);
        numberStack.push(6);
        numberStack.push(21);


        numberStack2.push(7);
        while(!numberStack.isEmpty()){
            System.out.println(numberStack.pop());
        }



    }




}