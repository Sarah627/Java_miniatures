package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // function for comparing precedence of operators

    public static int precedence(String c){
        return switch (c) {
            case "^" -> 3;
            case "*", "/" -> 2;
            case "+", "-" -> 1;
            default -> -1;
        };
    }

    // function to convert the infix expression into postfix:

    public static String toPostFix(String expression){
        GenericArrayBasedStack<String> parser = new GenericArrayBasedStack<>();
        ArrayList<String> finalExpression = new ArrayList<>();
        String current;
        for(int i = 0;i<expression.length();i++){
            current = expression.charAt(i)+"";
            if(current.matches("[0-9a-zA-Z]")){
                finalExpression.add(current);
            } else if (current.equals("(")) {
                parser.push(current);
            } else if (current.matches("[+\\-*/]")) {
                while ( !parser.isEmpty() && precedence(current) <= precedence(parser.top()) ){
                    finalExpression.add(parser.pop());
                }
                parser.push(current);
            } else {
                while (!parser.isEmpty() && !parser.top().equals("(")){
                    finalExpression.add(parser.pop());
                }
                parser.pop();
            }
            }
        while(!parser.isEmpty()){
            finalExpression.add(parser.pop());
        }

        return finalExpression.toString();
    }
    public static void main(String[] args) {
        Stack pages = new Stack(5);

        System.out.println(toPostFix("(a+b)-c*d"));
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

        Queue track1 = new Queue(10);

        track1.enqueue(4);
        track1.enqueue(3);
        track1.enqueue(2);
        track1.enqueue(10);
        track1.enqueue(7);
        track1.enqueue(8);
        track1.enqueue(0);
        track1.enqueue(6);
        track1.enqueue(1);
        track1.enqueue(5);


        for(int i = 0; i < 10;i++){
            System.out.println(track1.dequeue());
        }
        int value;
        CircularQueue circleQueue = new CircularQueue(5);
        circleQueue.enqueue(5);
        circleQueue.enqueue(2);
        circleQueue.enqueue(4);
        circleQueue.enqueue(3);
        circleQueue.enqueue(1);
        value = circleQueue.dequeue();
        System.out.println(value);
        value = circleQueue.dequeue();
        System.out.println(value);
        circleQueue.enqueue(10);
        circleQueue.enqueue(6);

        GenericArrayBasedQueue<String> queries = new GenericArrayBasedQueue<>(5);
        queries.enqueue("CREATE");
        queries.enqueue("TABLE");
        queries.enqueue("students");
        queries.enqueue("(id INTEGER AUTOINCREMENT, name TEXT, age INTEGER)");
        queries.enqueue("Hello");


        for (int i = 0; i < 5; i++) {
            System.out.println(queries.dequeue());
        }




        GenericCircularQueue<Character> password = new GenericCircularQueue<>(7);
        password.enqueue('Y');
        password.enqueue('4');
        password.enqueue('@');
        password.enqueue('M');
        password.enqueue('i');
        password.enqueue('%');
        password.enqueue('%');

        for (int i = 0; i < 6; i++) {
            System.out.println(password.dequeue());
        }


        LinkedList list = new LinkedList();

        list.insertFirst(1);
        list.insertFirst(12);
        list.insertFirst(9);
        list.insertFirst(78);
        list.insertAt(0,50);

        list.removeAt(0);
        list.removeElement(9);


        GenericLinkedList<String> names = new GenericLinkedList<>();
        names.insertAt(0,"Ali");
        names.insertAt(1,"Moaaz");
        names.insertAt(2,"Mudather");
        names.insertAt(3,"Mahdi");
        names.insertAt(4,"Mohammed");
        names.insertAt(5,"Omar");


        GenericLinkedList<Double> receipt = new GenericLinkedList<>();
        receipt.insertAt(0,250.56);
        receipt.insertAt(1,45.5);
        receipt.insertAt(2,98.25);
        receipt.insertAt(3,45.0);
        receipt.insertAt(4,789.2);
        receipt.insertAt(5,1000.0);

        receipt.removeAt(2);

        receipt.insert(85.2);
        receipt.insert(54.2);
        receipt.insert(842.5);



        DoublyLinkedList doubleList = new DoublyLinkedList();
        doubleList.insertFirst(10);
        doubleList.insertFirst(20);
        doubleList.append(5);
        doubleList.insertAt(1, 15);
        doubleList.removeAt(2);
        doubleList.removeElement(15);


    }




}