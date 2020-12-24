package com.alevel.work8;

public class Different {
    public static void main(String[] args) {
        System.out.println("Arrow");
        int[] myArray = new int[6];
        for (int i = 0; i < 6; i++) {
            myArray[i] = 1 + (int) (Math.random() * 9);
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(" " + myArray[i]);
        }
        int different = findDifferent(myArray);
        System.out.print(" Different elements are " + different);
    }


    public static int findDifferent(int[] numbers) {
        int different1=0;
        int[] counter = new int[6];
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                if ((counter[j] != 1) && (numbers[i] == numbers[j])) {

                    counter[j] = 1;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            if (counter[i] != 1){
                different1 = different1+1;
            }
        }
        return different1;
    }
}