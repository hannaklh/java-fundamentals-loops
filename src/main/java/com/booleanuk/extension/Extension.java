package com.booleanuk.extension;

public class Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to
        numsEven = new int[4];
        int number = -2;
        for (int i = 0; i < 4; i++) {
            numsEven[i] = number+2;
            number=numsEven[i];
        }



        
    }
}
