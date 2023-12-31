package com.akshet.Stack;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {

    private static int TwoStackGame(Stack<Integer> stack1, Stack<Integer> stack2, int max) {
       return helperFunction(stack1,stack2,0,0, max);
    }

    private static int helperFunction(Stack<Integer> stack1, Stack<Integer> stack2, int sum, int count,int max) {
        if(sum>max || stack1.isEmpty() || stack2.isEmpty())
            return count;

        int left= 0;
        int right =0;
        if(!stack1.isEmpty()){
            int remove_left_element = stack1.pop();
            left = helperFunction(stack1,stack2,sum+remove_left_element,count+1,max);
        }
        if(!stack2.isEmpty()) {
            int remove_right_element = stack2.pop();
            right = helperFunction(stack1,stack2,sum+remove_right_element,count+1,max);
        }
        return Math.max(left,right);
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
                System.out.print(stack_1.get(i)+" ");
            }
            System.out.println();

            System.out.println("Enter the elements of Second Stack: ");
            for( int i =0;i<length_2;i++){
                stack_2.push(scan.nextInt());
            }

            System.out.println("Entered elements of Second Stack are: ");
            for( int i =0;i<length_2;i++){
                System.out.print(stack_2.get(i)+" ");
            }System.out.println();

            int ans = TwoStackGame(stack_1,stack_2,max);
            System.out.println(ans);

            num--;
        }

    }

}
