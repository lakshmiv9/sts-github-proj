package com.example.demo.Core;

public class inhertSample {
    private int cardname;
    private String cardnum;
    String cardtype;

    inhertSample(int cardname,String cardnum, String cardtype){
        this.cardname=cardname;
        this.cardnum=cardnum;
        this.cardtype=cardtype;
    }
public String getCardtype(){
        return cardtype;
}
    public inhertSample(String cardtype) {
        this.cardtype=cardtype;
    }
    public void showDetails() {
        System.out.println("Main Card Type: " + getCardtype());
    }
   public static void samplemethod(){
        System.out.println("print this static method in main");
    }
}
class subclass extends inhertSample{

    //create a constructor for subclass
    private String ownerName;

    public subclass(String ownerName) {
        super("chase shappire"); // Calls public constructor of parent
        super.showDetails(); //super keyword to be used in constructor of sublcass and
        // can access methods and variables of superclass
        inhertSample.samplemethod();
        subclass.samplemethod();
        this.ownerName = ownerName;
    }
   // @Override --annotation is not strictly required — but it is strongly recommended.
    public void showDetails() {
        System.out.println("sub Card Type: " + getCardtype());
        System.out.println("sub Owner Name: " + ownerName);
    }
//static method overriden
    public static void samplemethod(){
        System.out.println("static method in child class");
    }

    public static void main(String[] args) {
        subclass obj = new subclass("Lakshmi");
        obj.showDetails();
        inhertSample obj1=new subclass("abc");
        obj1.showDetails();
        //subclass obj3=new inhertSample("maintype"); --compilation error
    }
}

