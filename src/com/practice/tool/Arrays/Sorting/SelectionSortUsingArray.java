package com.practice.tool.Arrays.Sorting;

import java.util.Random;

public class SelectionSortUsingArray {

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
        int[] sortedArray = sortSelection(array);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + sortedArray[i]);
        }
    }

    private static int[] sortSelection(int[] array) {
        int maxNumberIndex = array.length - 1;
        for (int i = array.length - 1; i > 0; i--) {
            maxNumberIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[maxNumberIndex]) {
                    maxNumberIndex = j;
                }
                if (j == 0) {
                    int temp = array[maxNumberIndex];
                    array[maxNumberIndex] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
