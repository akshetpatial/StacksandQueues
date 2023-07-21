package com.akshet.Stack;

public class Dynamic_Custom_Stack extends Custom_Stack{

    // We need to Define this otherwise It will give error as constructors needs to be initialized for every class ( including Child class ) unlike
    // other methods
    public Dynamic_Custom_Stack(int size) {
        super(size);
    }

    public Dynamic_Custom_Stack() {
        super();
    }
    @Override
    public int[] push(int item) throws Exception {
        if(index == data.length-1){
            int[] temp = new int[data.length * 2];
            int index = 0;
            for( int element : data){
                temp[index] = element;
                index++;
            }
            data = temp;
        }
        // This will run the push present in the Custom_Stack.java class
        return super.push(item);
    }
}
