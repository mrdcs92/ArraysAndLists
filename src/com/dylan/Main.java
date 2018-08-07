package com.dylan;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static listArrayList myList = new listArrayList();

    public static void main(String[] args) {
	// write your code here

        //int[] myIntegers = getIntegers(5);
        //int[] sorted = sortIntegers(myIntegers);
        //printArray(sorted);

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            myList.addItem(scanner.nextLine());
        }

        //myList.addItem("Hi there");
        //myList.addItem("Second item");
        //myList.addItem("third item");

        myList.printMyList();


    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i <array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i<sortedArray.length-1; i++){
                if(sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }
}
