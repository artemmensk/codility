package com.artemmensk.codility.lesson3;

public class TapeEquilibrium {

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{2000, -2000}));
    }

    public int solution(int[] A) {
        int sum = 0;

        for (int i : A) {
            sum += i;
        }


        int leftTmp = A[0];
        int rightTmp = sum - A[0];
        int result = Math.abs(leftTmp - rightTmp);

        for (int i = 1; i < A.length - 1; i++) {
            rightTmp -= A[i];
            leftTmp += A[i];

            final int diff = Math.abs(leftTmp - rightTmp);
            if (diff < result) {
                result = diff;
            }
        }

        return result;
    }
}
