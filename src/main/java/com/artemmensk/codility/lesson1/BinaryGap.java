package com.artemmensk.codility.lesson1;

public class BinaryGap {

    private final static int ZERO = 48;

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(17));
    }

    public int solution(int N) {
        int count = 0;
        int result = 0;
        for (int i : Integer.toBinaryString(N).chars().toArray()) {
            if (i == ZERO) {
                count++;
            } else {
                if (result < count) {
                    result = count;
                }
                count = 0;
            }
        }

        return result;
    }
}
