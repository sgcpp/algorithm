package com.java.search;
import java.util.Scanner;

public class Search {
    public static void main( String[] args){
        int[] nums= {2,3,4, 5, 6, 7, 8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number you want to search: ");
        int target = scanner.nextInt();
        //int result= linerSearch(nums, target);
        int result= binarySearch(nums, target);
        if(result==-1){
            System.out.println("Number not found.");
        }else{
            System.out.println("The number is at index " + result);
        }
    }

    //This is binary search algorithm.
    public static int binarySearch(int[] nums, int target) {
        //{6,4,2,8,3,10,9}
        int start =0;
        int end = nums.length-1; //6
         while(start <= end){
             int mid = (start + end)/ 2;
             if( nums[mid] == target){
                 return mid;
             }
             if(nums[mid] < target){
                 start = mid+1;
             }else{
                 end = mid-1;
             }
         }
        return -1;
    }

    //This is liner search algorithm.
    public static int linerSearch(int[] nums, int target){
        for(int i=0; i<nums.length; i++)
            if(nums[i] == target){
                return i;
        }
        return -1;
    }

}
