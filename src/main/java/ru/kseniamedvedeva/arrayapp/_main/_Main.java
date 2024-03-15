package ru.kseniamedvedeva.arrayapp._main;

import ru.kseniamedvedeva.arrayapp.service.ArrayFunctions;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        System.out.println("Our array:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(intArray));

        int countEvenNumb = ArrayFunctions.CountEvenNumbersInArray(intArray);
        System.out.println(countEvenNumb + " numbers are even in the array");

        int countOddNumb = ArrayFunctions.CountOddNumbersInArray(intArray);
        System.out.println(countOddNumb + " numbers are odd in the array");

        int countPrimeNum = ArrayFunctions.CountPrimeNumbersInArray(intArray);
        System.out.println(countPrimeNum + " numbers are prime in the array");

        int sum = ArrayFunctions.SumNumbersInArray(intArray);
        System.out.println("Summa all numbers in the array = " + sum);

        int difEvenOddNum = ArrayFunctions.DifferenceBetweenEvenAndOddIndexes(intArray);
        System.out.println("Difference between even and odd indexes = " + difEvenOddNum);

        int zeroNum = ArrayFunctions.FindZeroInArray(intArray);
        System.out.println(zeroNum + " zero in the array");
    }
}
