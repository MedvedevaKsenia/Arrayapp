package ru.kseniamedvedeva.arrayapp.service;

public class ArrayFunctions {
    public static int CountEvenNumbersInArray(int[] intArray) {
        int countEvenNumb = 0;
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] == 0) || (intArray[i] % 2 == 0)) {
                countEvenNumb++;
            }
        }
        return countEvenNumb;
    }

    public static int CountOddNumbersInArray(int[] intArray) {
        int countOddNumb = 0;
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] != 0) && (intArray[i] % 2 != 0)) {
                countOddNumb++;
            }
        }
        return countOddNumb;
    }

    public static int CountPrimeNumbersInArray(int[] intArray) {
        int countPrimeNumb = 0;
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] != 0) && (isPrime(intArray[i]))) {
                countPrimeNumb++;
            }
        }
        return countPrimeNumb;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int SumNumbersInArray(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static int DifferenceBetweenEvenAndOddIndexes(int[] intArray) {
        int sumEvenNum = 0;
        int sumOddNum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if ((i == 0) || (i % 2 == 0)) {
                sumEvenNum += intArray[i];
            } else {
                sumOddNum += intArray[i];
            }
        }
        return sumEvenNum - sumOddNum;
    }

    public static int FindZeroInArray(int[] intArray) {
        int zeroNum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                zeroNum++;
            }
        }
        return zeroNum;
    }
}
