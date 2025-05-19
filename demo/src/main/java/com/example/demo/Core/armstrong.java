package com.example.demo.Core;
import java.lang.Math.*;
//153. 3 digit number so each digit power of 3.
public class armstrong {
    public static void main(String[] args) {


        int num = 153;
        int copy=num;
        int result = 0;
        int power = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10; // this will break number into digits ; first it starts with 3 then 5 then 1
            result += Math.pow(digit, power);
            num=num/10; //used in a loop to process each digit from right to left., first loop we get 15 next loop 1
        }


        if (result == copy) {
            System.out.println(copy + " is an Armstrong number.");
        } else {
            System.out.println(copy + " is not an Armstrong number.");
        }
    }
}
