package com.artemmensk.codility.lesson3;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 85, 30));
    }

    public int solution(int X, int Y, int D) { ;
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
