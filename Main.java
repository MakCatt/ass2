package com.company;

public class Main {

    public static void main(String[] args) {


        //Stack
      /*  MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        stack.push(6);

        stack.print();

        System.out.println();


        //Queue
        MyQueue<Integer> q = new MyQueue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        System.out.println(q.peek());

        q.dequeue();
        q.print();


        System.out.println(q.peek());

       */

        MyHeap<Integer> heap = new MyHeap<>(10);

        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.print();


    }
}
