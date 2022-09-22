package com.practice.tool.Arrays.Sorting.recursion;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Factorial {

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else
            return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        LocalDateTime from = LocalDateTime.now();
        int fact = factorial(10);
        LocalDateTime to = LocalDateTime.now();

        System.out.println(Duration.between(from, to).getNano());
    }
}
