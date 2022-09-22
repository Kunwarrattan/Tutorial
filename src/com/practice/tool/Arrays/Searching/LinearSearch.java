package com.practice.tool.Arrays.Searching;

import java.util.Random;

public class LinearSearch {

    public String linearSearchInArray() {
        return "";
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int upperBound = 10000;
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(upperBound);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(array[i]);
        }
    }
}
