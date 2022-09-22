package com.practice.tool.Arrays.Sorting;

import java.util.Random;

public class InsertionSortUsingArray {
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] array = new int[arrayLength];
        Random random = new Random();
        int upperBound = 20;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(upperBound);
        }
        System.out.println("Unsorted Array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\nSorted Array");
        int[] sortedArray = insertionSort(array);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + sortedArray[i]);
        }
    }

    private static int[] insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i = 0;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        return array;
    }
}
