package com.example.demo.Core;

//0 1 1 2 3 5 8 13 21 34
public class fibonicci {

    public void fib(int number){
        int a=0,b=1;
        for(int i=0;i<number;i++){
            System.out.println(a);
            int temp=a+b; //store the sum in a temp variable which will become next number in addition
            a=b;
            b=temp;
        }

    }
    public static void main(String [] args){
        fibonicci obj=new fibonicci();
        obj.fib(10);
    }
}
