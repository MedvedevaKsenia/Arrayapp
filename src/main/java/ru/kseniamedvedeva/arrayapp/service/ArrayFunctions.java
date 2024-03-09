package ru.kseniamedvedeva.arrayapp.service;

public class ArrayFunctions {

    public static int CountEvenNumbersInArray(int[] intArray) {
        int countEvenNumb = 0;
        for (int i : intArray) {
            if (intArray[i] % 2 == 0) {
                countEvenNumb++;
            }
        }
        return countEvenNumb;
    }

    public static int CountOddNumbersInArray(int[] intArray) {
        int countOddNumb = 0;
        for (int i : intArray) {
            if (intArray[i] % 2 != 0) {
                countOddNumb++;
            }
        }
        return countOddNumb;
    }

    public static int SumNumbersInArray(int[] intArray) {
        int sum = 0;
        for (int i : intArray) {
            sum += intArray[i];
        }
        return sum;
    }

    public static int FindZeroInArray(int[] intArray) {
        int zeroNum = 0;
        for (int i : intArray) {
            if (intArray[i] == 0) {
                zeroNum++;
            }
        }
        return zeroNum;
    }
}
