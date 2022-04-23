package com.company;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> arr;


    public MyStack()
    {
        arr = new ArrayList<>();
    }

    public void push(T X) {
        arr.add(X);
    }

    public T peek() {
        return arr.get(size()-1);
    }

    public int size(){
        return arr.size();
    }

    public T pop() {
        return arr.remove(size()-1);
    }

    public boolean empty() {
        return size() == 0 ;
    }

    public void print(){
        for (int i = 0; i < size(); i ++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

}

