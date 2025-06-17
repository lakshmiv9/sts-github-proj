package com.example.demo.DataStrctureExmpl;

public class Linearsrch {
    public static void main(String args[]){
        int arr[] = {12,34,56,77,7,8,92,323,24468,67768};
        int num=7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("num found at pos "+arr[i]);
            }else {
                System.out.println("num not found ");
            }
        }
    }
}
