package com.practice.tool.Arrays.Sorting;

import java.util.Random;

public class BubbleSortUsingArray {

    public static int[] sortBubble(int[] array) {
        //external Index
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int arrayLength = 1000;
        int[] array = new int[arrayLength];
        Random random = new Random();
        int upperBound = 100007;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(upperBound);
        }
        System.out.println("Unsorted Array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\nSorted Array");
        int[] sortedArray = sortBubble(array);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + sortedArray[i]);
        }
    }
}
