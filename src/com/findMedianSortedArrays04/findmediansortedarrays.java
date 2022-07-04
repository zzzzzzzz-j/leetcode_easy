package com.findMedianSortedArrays04;

public class findmediansortedarrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {3};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i,j;
        for(int k=0;k<nums1.length;k++){
            nums[k] = nums1[k];
        }
        for(int k=nums1.length;k<nums1.length + nums2.length;k++){
            nums[k] = nums2[k-nums1.length];
        }
        for(i=0;i<nums1.length + nums2.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
            System.out.println(nums[i]);
        }
        if((nums.length)%2==1){
            int result;
            result = nums[(nums.length)/2];
            return result;
        }else{
            float result;
            int t=(nums.length)/2;
            result = (float) ((nums[t]+nums[t-1])/2.0);
            return result;
        }
    }
}