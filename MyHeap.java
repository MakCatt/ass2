package com.company;

import java.util.*;

public class MyHeap<T extends Comparable<T>> {
    private int size;
    private int maxsize;
    private ArrayList<T> heap;


    public MyHeap(int maxsize)
    {
        heap = new ArrayList<>(maxsize);
        this.maxsize = maxsize;
        this.size = 0;
    }


    public void add(T item){
        if (size == 0){
            heap.add(item);
        }
        if (size >= maxsize){
            System.out.println("Overload!");
            return;
        }
        size++;
        heap.add(item);
        int curr = size;
        while(heap.get(curr).compareTo(heap.get(parent(curr))) > 0 && curr > 0){
            Collections.swap(heap, curr, parent(curr));
            curr = parent(curr);
        }
    }

    public void removeRoot(){
        heap.set(1, heap.get(size));
        heap.remove(size);
        size--;
        heapify(1);
    }

    public void heapify(int pos){
        if (!isLeaf(pos)){
            if (right(pos) <= size && heap.get(left(pos)).compareTo(heap.get(pos)) > 0){
                Collections.swap(heap, pos, left(pos));
                heapify(left(pos));
            }
            if (right(pos) <= size && heap.get(right(pos)).compareTo(heap.get(pos)) > 0){
                Collections.swap(heap, pos, right(pos));
                heapify(right(pos));
            }
        }
    }

    private int right(int i){
        return i * 2 + 1;
    }

    private int left(int i){
        return i * 2;
    }

    private int parent(int i){
        return i / 2;
    }

    private boolean isLeaf(int i) {
        return i > (size / 2) && i <= size;
    }

    public void print(){
        for (int i = 0; i < size; i ++){
            System.out.print(heap.get(i) + " ");
        }
        System.out.println();
    }


    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= size; i ++){
            str.append(heap.get(i)).append(" ");
        }
        return str.toString();
    }
}
