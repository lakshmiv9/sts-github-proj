package com.example.demo.Core;

public class interfaceClass implements interfaceExmpl{
    @Override
    public String bankName(String bank) {
        return bank;
    }

    @Override
    public void defaltmethod() {
        interfaceExmpl.super.defaltmethod();
    }

    public static void main(String [] args){
        interfaceClass interfaceClass=new interfaceClass();
        interfaceClass.defaltmethod(); //access default methos with object instance
        interfaceExmpl.statMethod(); //access datic methos with direct interfacename 
        System.out.println("bank name: "+ interfaceClass.bankName("chase"));
    }
}
