package com.example.demo.DataStrctureExmpl;

public class LinkedlistExmpl {
  class Node{
      int data;
      Node next;

      Node(int data){
          this.data=data;
          this.next=null;
      }
  }
private Node head; //head of the list

    //https://www.geeksforgeeks.org/insert-a-node-at-front-beginning-of-a-linked-list/
  public void insetAtHead(int data){
      Node newNode=new Node(data);
      newNode.next=head;
      head=newNode;

  }
//  https://www.geeksforgeeks.org/insert-node-at-the-end-of-a-linked-list/
    public void insetAtEnd(int data){
        Node newNode=new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;


    }
    //https://www.geeksforgeeks.org/singly-linked-list-tutorial/
    public void delete(int data){
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public boolean search(int data){
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void travserse(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String [] args){
      LinkedlistExmpl list=new LinkedlistExmpl();
        list.insetAtEnd(1);
        list.insetAtEnd(2);
        list.insetAtHead(0);
        list.insetAtEnd(3);
        System.out.println("Linked List after insertions:");
        list.travserse(); // Output: 0 -> 1 -> 2 -> 3 -> null

        // Test search
        System.out.println("Search for 2: " + list.search(2)); // Output: true
        System.out.println("Search for 5: " + list.search(5)); // Output: false

        // Test deletion
        list.delete(2);
        System.out.println("Linked List after deleting 2:");
        list.travserse(); // Output: 0 -> 1 -> 3 -> null
    }
}
