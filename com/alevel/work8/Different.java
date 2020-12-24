package com.alevel.work8;

public class Different {
    public static void main(String[] args) {
        System.out.println("Arrow");
        int[] myArray = new int[9];
        for (int i = 0; i < myArray.length; i++) {// add for any size
            myArray[i] = 1 + (int) (Math.random() * 9);
            System.out.print(" " + myArray[i]);
        }
        int different = findDifferent(myArray);
        System.out.print(" Different elements are " + different);
    }


    public static int findDifferent(int[] numbers) {
        int different1=0;
        int[] counter = new int[numbers.length];// add for any size
        for (int i = 0; i < numbers.length -1 ; i++) {// add for any size
            for (int j = numbers.length-1; j > i; j--) {// add for any size
                if ((counter[j] != 1) && (numbers[i] == numbers[j])) {

                    counter[j] = 1;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {// add for any size
            if (counter[i] != 1){
                different1 = different1+1;
            }
        }
        return different1;
    }
}