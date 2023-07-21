package com.akshet.Queue;

import com.akshet.Stack.Custom_Stack;
import com.akshet.Stack.Dynamic_Custom_Stack;

import java.util.Arrays;
import java.util.Scanner;

public class Custom_Queue {

    protected int[] data;

    private static final int Default_Size = 10;
    public Custom_Queue() {
        this(Default_Size);
    }

    public Custom_Queue(int size){
        this.data = new int[size];
    }

    int end = -1;

    public int[] push(int item) throws Exception {
        if(end == data.length-1){
            throw new Exception("Queue is Full, can not enter more elements");
        }else{
            end++;
            data[end] = item;
            return data;
        }
    }

    public int pop() throws Exception {
        if (end == 0) {
            throw new Exception("Queue is empty, can not remove more elements");
        } else {
            int pop_element = data[0];
            for( int i=0; i<end;i++){
                data[i]= data[i+1];
            }
            data[end]= 0;
            end--;
            return pop_element;
        }
    }
    public int peek() throws Exception{
        if (end == -1) {
            throw new Exception("Queue is empty, can not remove more elements");
        } else {
            return data[0];
        }
    }

    public void display(){
        if (end == -1) {
            System.out.println("[ ]");
        } else {
            System.out.println(Arrays.toString(data));
        }
    }


    public static void main(String[] args) throws Exception {

        System.out.println("Enter the Size of the Queue: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        // Custom_Queue customQueue = new Custom_Queue(size);


        // I am calling here Circular Queue
        Circular_Queue customQueue = new Circular_Queue(size);

        System.out.println("Enter 1 to push: ");
        System.out.println("Enter 2 to pop: ");
        System.out.println("Enter 3 to peek: ");
        System.out.println("Enter 0 to Exit: ");

        System.out.println("Please Enter your choice");
        int choice = scan.nextInt();

        boolean check = true;

        while (check) {
            switch (choice) {
                case 0:
                    check = false;
                    System.out.println("Bye! ");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Enter the value you need to push into the Queue: ");
                    int element = scan.nextInt();
                    customQueue.push(element);
                    customQueue.display();
                    break;
                case 2:
                    int pop_value = customQueue.pop();
                    System.out.println("The value that was popped is :" + pop_value);
                    customQueue.display();
                    break;
                /*case 3:
                    System.out.println("Top Most Element is: " + customQueue.peek());
                    customQueue.display();
                    break;*/
                default:
                    System.out.println("Please Enter only from 0 to 3");
                    break;
            }
            System.out.println("Please Enter your choice");
            choice = scan.nextInt();
        }
    }
}
