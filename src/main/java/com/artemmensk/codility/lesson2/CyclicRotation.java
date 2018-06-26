package com.artemmensk.codility.lesson2;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{}, 0)));
    }

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        if (A.length == 0 || K % A.length == 0) {
            return A;
        }

        K = K % A.length;

        for (int i = 0; i < A.length; i++) {

            if (i + K < result.length) {
                result[i + K] = A[i];
            } else {
                result[i + K - A.length] = A[i];
            }

        }

        return result;
    }
}
