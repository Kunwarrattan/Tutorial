package com.practice.tool.Arrays.Sorting;

import java.util.Random;

public class ShellSortUsingArray {
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
        int[] sortedArray = ShellSort(array);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" " + sortedArray[i]);
        }
    }

    private static int[] ShellSort(int[] array) {

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {

                int newElement = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }

        }
        return array;
    }
}
