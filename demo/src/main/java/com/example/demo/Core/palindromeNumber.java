package com.example.demo.Core;

import java.util.stream.IntStream;

public class palindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; //get the last digit first, so start with 1, next is 2 next is 1
            reversed = reversed * 10 + digit; // 0*10+1=1 ; 1*10+2=12 ; 12*10+1=121
            num /= 10;// remaining 12 ; remaining 1 ;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }

        //java 8
        //select range and Compare str.charAt(i) with the mirror character from the other end: str.charAt(str.length() - i - 1)
        String str = "racecar";

        boolean isPalindrome = IntStream.range(0, str.length())
                .allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

        System.out.println(str + (isPalindrome ? " is" : " is not") + " a palindrome.");
    }
}
