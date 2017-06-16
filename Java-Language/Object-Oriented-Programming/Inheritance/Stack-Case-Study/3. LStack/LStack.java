package com.rajeshpatkar 

public class LStack {
    private Node head;
    public void push(int v){
        head = new Node(v,head);
    }
    public int pop(){
        if(head==null) return -1;
        Node t = head;
        head = head.getNext();
        return t.getV();
    }
    public void print(){
        System.out.println("Printing LStack");
        Node t = head;
        while(t != null){
            System.out.println(t.getV());
            t = t.getNext();
        }
    }
}
