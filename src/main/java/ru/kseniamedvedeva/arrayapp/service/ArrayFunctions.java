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
            if (intArray[i] > 1) {
                for (int k = 2; k <= Math.sqrt(intArray[i]); k++) {
                    if (intArray[i] % k == 0) {
                        countPrimeNumb++;
                    }
                }
            }
        }
        return countPrimeNumb;
    }

    public static int SumNumbersInArray(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
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
