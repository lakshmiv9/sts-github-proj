package com.example.demo.Strings;


public class bufferBuilder {
    public static void main(String[] args) {
        String name1 = new String("Alice");
        String name2 = name1;

        String name3=new String ("Alice");
        System.out.println("name1 == name2 " + (name1 == name2)); // true (same object)
        System.out.println("name1.equals(name2) " + name1.equals(name2)); // true (same content)
        System.out.println("name1==name3?" +(name1==name3)); // false as diff oject
        System.out.println("name1==name3?" +name1.equals(name3)); // true as same content

        // string buffer thread safe so less performance due to synchronization
        StringBuffer sb=new StringBuffer();
        sb.append(name1+"w" +
                "onder" +
                "land");
        System.out.println("SB" +sb.toString());

        // string builder not thread safe so high performance as no synchronization overhead
        StringBuilder sbuild=new StringBuilder();
        sbuild.append(name3+"w" +
                "onder" +
                "land");
        System.out.println("SBuilder " +sbuild.toString());

        //reverse of a string
        String original="John";
        String reverse = null;
        for (int i=original.length()-1;i>=0;i--){
            reverse+= String.valueOf(original.charAt(i));

        }
        System.out.println("reverse: " +reverse);

        //reverse using string builder
        String str = "Hello";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
