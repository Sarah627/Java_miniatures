package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        // array list is a resizable array
        //creating an array list
        // Add, Access, Change, and Remove an item.
        //Size of array list
        ArrayList<Integer> numbers = new ArrayList<>();
        File testFile = new File("Test File.txt");
        // the array list parameter should be replaced with reference data type, we can store objects only
        // we are not specifying the size of the array list, because when we append elements the array list will grow
        //Add element to arraylist
        numbers.add(12);
        numbers.add(10);
        numbers.add(94);
        // when you use the parameter index, you are going to add elements at specific index then shift the rest, take care that you are not replacing.
        numbers.add(2,13);
        System.out.println("printing elements for the first time");
        for(Integer num : numbers){
            System.out.println(num);
        }
        System.out.println("the initial size of our array list is: "+numbers.size());
        System.out.println("-------------------");
        System.out.println("printing elements in the file");
        System.out.println("-------------------");
        try (PrintWriter out = new PrintWriter(new FileWriter(testFile,true))) {
            for( Integer num : numbers){
                out.printf("%d ", num);
            }
        }
        // accessing elements in array list using get.
        System.out.println("printing element using get method");
        System.out.println(numbers.get(1));
        //edit element in an array list
        numbers.set(1,100);
        System.out.println("-------------------");
        System.out.println("printing element after editing the list using set() method");
        System.out.println(numbers.get(1));
        System.out.println("the current size of our array list is: "+numbers.size());

        // remove elements by index
        numbers.remove(3);
        System.out.println("-------------------");
        System.out.println("printing elements after removing the element at index 3");
        for (Integer o : numbers) System.out.println(o);
        System.out.println("the current size of our array list is: "+numbers.size());
        //remove elements by their value
        numbers.remove(Integer.valueOf(100));
        System.out.println("-------------------");
        System.out.println("printing elements after removing the element of value 100");
        for (Integer o : numbers) System.out.println(o);
        System.out.println("the current size of our array list is: "+numbers.size());
        System.out.println("-------------------");
        System.out.println("sorting the elements");
        numbers.add(87);
        numbers.add(7);
        numbers.add(29);
        numbers.add(54);
        Collections.sort(numbers);
        // for each loop is safe for not exceeding the array boundaries, but you can only traverse elements and not edit them.
        for(Integer num : numbers) System.out.println(num);
        // solving a challenge to print the value of element in an array concatenated with its index number
        System.out.println("------------");
        int[] arr = {5,2,2,0};
        int index = 0;
        for(int num : arr){
            System.out.println(num + " " + index++);
        }
        //create small program to take 10 integers from user and then sort and print them on screen
        Scanner input = new Scanner(System.in);
        System.out.println("---------------");
        // System.out.println("Please enter 10 integers: ");
        // ArrayList<Integer> userPrompt = new ArrayList<>();
        // int inputLimit = 10;
        // int num;
        // int counter =0;
        // while(counter < inputLimit){
        //     num = input.nextInt();
        //     if(!userPrompt.contains(num)) userPrompt.add(num);
        //     counter++;
        // }
        //
        // Collections.sort(userPrompt);
        // System.out.println("sorted elements:");
        // for(Integer prompt : userPrompt) System.out.println(prompt);


        // challenge number 2
        ArrayList<Integer> numberList = new ArrayList<>();


       do {
           System.out.println("please choose an option (number):");
           System.out.println("1.Add\n1.Remove\n3.Display\n4.Exit");
           int userInput= input.nextInt();
           switch (userInput){
               case 1 -> numberList.add(input.nextInt());
               case 2 -> numberList.remove(Integer.valueOf(input.nextInt()));
               case 3 -> System.out.println("List "+numberList);
               case 4 -> System.exit(1);
               default -> throw new IllegalStateException("Unexpected value: " + userInput);
           }
       }while(true);




    }
}
