package com.artemmensk.codility.lesson4;

public class PermCheck {
    public static void main(String[] args) {
        System.out.println(new PermCheck().solution(new int[]{4,2,3,1}));
    }

    public int solution(int[] A) {
        int[] array = new int[A.length];
        for (int i : A) {

            if (i > A.length) {
                return 0;
            }

            if (array[i-1] == 1) {
                return 0;
            }

            array[i-1] = 1;
        }

        return 1;
    }
}
