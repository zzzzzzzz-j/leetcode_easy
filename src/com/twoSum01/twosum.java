package com.twoSum01;

public class twosum {
    public static void main(String[] args){
        int[] arr = {3,2,4};
        int target = 6;
        twoSum(arr,target);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr1 = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if( target == nums[i]+nums[j] && i!=j ){
/*                    System.out.println("["+i+","+j+"]");*/
                    arr1[0]=i;
                    arr1[1]=j;
                }
            }
        }
        return arr1;
    }
}


