package com.company;

import java.util.ArrayList;

public class MyQueue <T>{

    ArrayList<T> ar = new ArrayList<>();


    public void print(){
        for (int i = 0; i < size(); i ++){
            System.out.print(ar.get(i) + " ");
        }
        System.out.println();
    }

    public int size(){
        return ar.size();
    }

    public T peek(){
        return ar.get(0);
    }

    public void enqueue(T X) {
        ar.add(X);
    }

    public void dequeue() {
        ar.remove(ar.get(0));
    }

    public boolean empty() {
        return size() == 0;
    }



}

