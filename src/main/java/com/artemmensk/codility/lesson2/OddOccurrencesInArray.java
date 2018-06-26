package com.artemmensk.codility.lesson2;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{1,1,2,3,2,9,5,9,3}));
    }

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        int a = 1;
        int b = 1;
        System.out.println(a + b);

        for (int i : A) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        return (int) set.toArray()[0];
    }
}
