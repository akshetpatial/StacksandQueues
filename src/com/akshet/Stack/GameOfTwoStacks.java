package com.akshet.Stack;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {

    private static void TwoStackGame(Stack<Integer> stack1, Stack<Integer> stack2, int max) {

    }

    public static void main(String[] args) {

        System.out.println("Enter the number of times you want to play the game: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Stack<Integer> stack_1;
        Stack<Integer> stack_2;

        while(num!=0){

            stack_1= new Stack<>();
            stack_2= new Stack<>();

            System.out.println("Enter the length of First Stack: ");
            int length_1 = scan.nextInt();

            System.out.println("Enter the length of Second Stack: ");
            int length_2 = scan.nextInt();

            System.out.println("Enter the Max number: ");
            int max = scan.nextInt();

            System.out.println("Enter the elements of First Stack: ");
            for( int i =0;i<length_1;i++){
                stack_1.push(scan.nextInt());
            }

            System.out.println("Entered elements of First Stack are: ");
            for( int i =0;i<length_1;i++){
                stack_1.get(i);
            }

            System.out.println("Enter the elements of Second Stack: ");
            for( int i =0;i<length_2;i++){
                stack_2.push(scan.nextInt());
            }

            System.out.println("Entered elements of Second Stack are: ");
            for( int i =0;i<length_2;i++){
                stack_2.get(i);
            }

            TwoStackGame(stack_1,stack_2,max);

            num--;
        }

    }

}
