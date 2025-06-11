package com.example.demo.DataStrctureExmpl;

import java.util.Stack;

public class Stacksexmpl {
    public static void main(String [] args){
       //Below is the stack implementation for
        //inserting random values

        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(10);
        stack.push(12);
        stack.push(11);

        stack.peek();

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + stack.peek());

        // Displaying the Stack after the Operation
        System.out.println(" Stack: " + stack);
        while (!stack.isEmpty()){
             stack.pop();
        }
        System.out.println("Final Stack: " + stack);

// if we want to insert values in loop below is implementation
        Stack<Integer> stack1=new Stack<>();
        push_stack(stack1);
        pop_stack(stack1);
        peek_stack(stack1);
        search_stack(stack1,1);
        search_stack(stack1, 6);
        System.out.println("Stack1 size"+stack1.size());

    }
   static void push_stack(Stack<Integer> s){
        for(int i=0;i<5;i++){
            s.push(i);
        }
       System.out.println("Stack1 after push "+s);
    }
    static void search_stack(Stack<Integer> s, Integer i){
        Integer pos=s.search(i);
        if(pos==-1)
            System.out.println("stack 1 element not found");
        else
            System.out.println("stack 1 element found "+pos);

    }
    static void pop_stack(Stack<Integer> s){
        System.out.println("Stack1 before pop"+s);
        s.pop();
        System.out.println("Stack1 after pop"+s);

    }
    static void peek_stack(Stack<Integer> s){
        Integer element = (Integer) s.peek();
        System.out.println("Element on stack top: " + element);

    }

}
