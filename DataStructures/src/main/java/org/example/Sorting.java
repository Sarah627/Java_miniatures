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


    public static <T extends Comparable<T>> void selectionSort(T[] elements){
        T temp;
        int minIndex;


        for (int i = 0; i < elements.length-1 ; i++) {
             minIndex = i;

            for (int current = i+1;  current<elements.length  ; current++) {
                if(elements[minIndex].compareTo(elements[current]) > 0) minIndex = current;
            }

            temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex]=temp;


        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] elements){
        for (int i = 1; i < elements.length ; i++) {
            T current=elements[i];
            int j = i;
            while(j > 0 && elements[j-1].compareTo(current)>0){
                elements[j] = elements[j-1];
                j--;
            }
            elements[j]=current;

        }
    }
}
