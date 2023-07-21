package com.akshet.Stack;

import java.util.Arrays;
import java.util.Scanner;

public class Custom_Stack {

    protected int[] data;

    private static final int default_size = 10;

    public Custom_Stack(int size) {
        this.data = new int[size];
    }

    public Custom_Stack(){
        this(default_size);
    }

    int index = -1;

    public int[] push(int item) throws Exception {
        if(index == data.length-1){
            throw new Exception("Stack is Full, can not enter more elements");
        }else{
            index++;
            data[index] = item;
            return data;
        }
    }

    public int pop() throws Exception {
        if (index == -1) {
            throw new Exception("Stack is empty, can not remove more elements");
        } else {
            int pop_element = data[index];
            data[index] = 0;
            index--;
            return pop_element;
        }
    }
    public int peek() throws Exception{
        if (index == -1) {
            throw new Exception("Stack is empty, can not remove more elements");
        } else {
            return data[index];
        }
    }

    public void display(){
        if (index == -1) {
            System.out.println("[ ]");
        } else {
            System.out.println(Arrays.toString(data));
        }
    }


    public static void main(String[] args) throws Exception {
        // Stack<Integer> new_stack = new Stack<>();
        System.out.println("Enter the Size of the Stack: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        // Custom_Stack customStack = new Custom_Stack(size);


        // I am calling here Dynamic Stack
        Dynamic_Custom_Stack customStack = new Dynamic_Custom_Stack(size);

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
                    System.out.println("Enter the value you need to push into the Stack: ");
                    int element = scan.nextInt();
                    customStack.push(element);
                    customStack.display();
                    break;
                case 2:
                    int pop_value = customStack.pop();
                    System.out.println("The value that was popped is :" + pop_value);
                    customStack.display();
                    break;
                case 3:
                    System.out.println("Top Most Element is: " + customStack.peek());
                    customStack.display();
                    break;
                default:
                    System.out.println("Please Enter only from 0 to 3");
                    break;
            }
            System.out.println("Please Enter your choice");
            choice = scan.nextInt();
        }
    }
}