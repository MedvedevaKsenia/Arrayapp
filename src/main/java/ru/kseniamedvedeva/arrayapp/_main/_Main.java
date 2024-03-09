package ru.kseniamedvedeva.arrayapp._main;

public class _Main {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
            System.out.println(intArray[i]);
        }
    }
}
