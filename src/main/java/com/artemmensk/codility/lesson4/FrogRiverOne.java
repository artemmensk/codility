package com.artemmensk.codility.lesson4;

public class FrogRiverOne {

    public static void main(String[] args) {
        System.out.println(new FrogRiverOne().solution(5, new int[]{2,1,5,4,3,4,5,4}));
    }

    public int solution(int X, int[] A) {
        int[] array = new int[X];
        for (int i = 0; i < A.length; i++) {
            if (array[A[i] - 1] == 0) {
                array[A[i] - 1] = 1;
                X--;
                if (X == 0) {
                    return i;
                }
            }
        }

        return -1;
    }
}