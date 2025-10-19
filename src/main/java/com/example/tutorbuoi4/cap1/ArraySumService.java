package com.example.tutorbuoi4.cap1;

public class ArraySumService {
    public int sumArray(int [] arr) {
        if (arr == null) throw new IllegalArgumentException("Mang ko dc null");

        int sum  = 0;
        for (int num : arr) {
            if (num < 0 || num > 1000) throw new IllegalArgumentException("mang phai nam trong khoang 0 den 1000");
            sum = sum + num;
        }
        return sum;
    }
}
