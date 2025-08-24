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
    }

}