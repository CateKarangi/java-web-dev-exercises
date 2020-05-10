package ArrayPractice;

import java.util.Scanner;

public class MyArray {

    public static void main(String[] args){
        //create an array
        final int[] nums = {1, 1, 2, 3, 5, 8};

        //loop through using enhanced for loop
        System.out.println("looping over an array using enhanced for loop");
        for(int i: nums) {
            System.out.println(i);
        }

         //printing the odd numbers in the array

         System.out.print("Odd Numbers : ");
        int i;
        for (i =0; i<nums.length; i++){

             if ( (nums [i] % 2) != 0 ){
                System.out.println(nums[i]);
            }
         }


        }


    }

