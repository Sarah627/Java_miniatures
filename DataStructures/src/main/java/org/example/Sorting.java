package org.example;

public class Sorting {

    public static <T extends Comparable<T>>  void bubbleSort(T[] elements){
        boolean swapped =true;
        T temp;
        while(swapped){
            swapped = false;
            for (int i = 0; i < elements.length-1; i++) {
                if (elements[i].compareTo(elements[i + 1]) > 0) {
                    temp = elements[i];
                    elements[i] = elements[i+1];
                    elements[i+1]= temp;
                    swapped=true;
                }
            }
        }
    }
}
