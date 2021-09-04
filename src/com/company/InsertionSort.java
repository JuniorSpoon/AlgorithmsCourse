package com.company;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int mainIndex = 1; mainIndex < intArray.length; mainIndex++) {

            int elementOnHold = intArray[mainIndex];

            int i;

            for (i = mainIndex; i > 0 && intArray[i - 1] > elementOnHold; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = elementOnHold;
        }

        System.out.println(Arrays.toString(intArray));
    }
}
