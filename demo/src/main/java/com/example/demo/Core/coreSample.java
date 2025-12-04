package com.example.demo.Core;
//constructor, static & final
public class coreSample {
private int age;
private final String dept="IT";
//constructor can be overloaded but  constructors cannot be overridden in Java.
    coreSample(){ // this is default constructor used for setter injection
        System.out.println("Dept : " + dept);
        System.out.println("income: "+income());
    }
    coreSample(int x){// constructor based injection
        this.age=x;
        // this.dept=dept; -gives error says final cannot be assigned
    }

public int getAge(){
     return age;
}
    //setter based injection
    public void setAge(int age){
        this.age=age;
    }
    public static void main(String[] args){
        coreSample core=new coreSample(); //this calls default constructor and injection happens via setter
        core.setAge(20);
        System.out.println("Age: " + core.getAge());
        coreSample core2=new coreSample(21);

        System.out.println("Real age : " + core2.getAge());
        System.out.println("Gender : " + coreSample.staticmethod()); //calling static method

    }

    //static block - They run once when the class is loaded. executed before bean
    static{
        String name="Alice";
        System.out.println(name);
    }
    //static method call a static method without creating an object
    static String staticmethod(){
        return "F";
    }

    final public int income(){
        return 100;
    }
    // final method can be overloaded
    // but cannot be overriden
    //cannot extend a class declared as final.
    int income(int montlysalary){

        return 10;
    }
    //static method can be overloaded but cannot ovverriden in child class
    String staticmethod(String str){
        return null;
    }

}
