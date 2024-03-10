package ru.kseniamedvedeva.arrayapp._main;

import java.util.Arrays;
import java.util.Random;

import static ru.kseniamedvedeva.arrayapp.service.ArrayFunctions.*;

public class _Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println("Our array:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(intArray));

        int countEvenNumb = CountEvenNumbersInArray(intArray);
        System.out.println(countEvenNumb + " numbers are even in the array");

        int countOddNumb = CountOddNumbersInArray(intArray);
        System.out.println(countOddNumb + " numbers are odd in the array");

        int countPrimeNum = CountPrimeNumbersInArray(intArray);
        System.out.println(countPrimeNum + " numbers are prime in the array");

        int sum = SumNumbersInArray(intArray);
        System.out.println("Summa all numbers in the array = " + sum);

        int difEvenOddNum = DifferenceBetweenEvenAndOddIndexes(intArray);
        System.out.println("Difference between even and odd indexes = " + difEvenOddNum);

        int zeroNum = FindZeroInArray(intArray);
        System.out.println(zeroNum + " zero in the array");
    }
}
