package com.akshet.Queue;

import java.util.Arrays;

public class Circular_Queue {

    protected int[] data;

    private static final int Default_Size = 10;
    public Circular_Queue() {
        this(Default_Size);
    }

    public Circular_Queue(int size){
        this.data = new int[size];
    }

    int end = -1;
    int start =0;
    int size = 0;

    public int[] push(int item) throws Exception {
        if(size == data.length){
            throw new Exception("Queue is Full, can not enter more elements");
        }else{
            data[size++] = item;
            end++;
            end = end%data.length;
            return data;
        }
    }

    public int pop() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty, can not remove more elements");
        } else {
            int pop_element = data[start++];
            start = start%data.length;
            size--;
            return pop_element;
        }
    }

    public void display() {
        System.out.println("Start: " +start);
        System.out.println("End: " +end);
        System.out.println("size: " +size);
        if (size == 0) {
            System.out.println("[ ]");
        } else {
            for (int i = start; i<=end;i++){
                System.out.print(data[i] + "->");
            }
            System.out.println();
        }
    }
}
