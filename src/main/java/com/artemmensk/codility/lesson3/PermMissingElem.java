package com.artemmensk.codility.lesson3;

public class PermMissingElem {

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{2,5,4,1}));
    }

    public int solution(int[] A) {
        int[] arr = new int[A.length + 1];
        for (int i : A) {
            arr[i-1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i+1;
            }
        }
        return 0;
    }
}
