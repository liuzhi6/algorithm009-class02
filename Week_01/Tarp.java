package com.company.oneWeek.operation;

/**
 * 接雨水
 */
public class Tarp {

    public static void main(String [] args){

        Tarp t =new Tarp();
        System.out.println(t.tarp(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public int tarp(int[] height) {
        int sum = 0;
        int max_left = 0;
        int[] max_rigth = new int[height.length];
        for (int i = height.length - 2; i >= 0; i--) {
            max_rigth[i] = Math.max(max_rigth[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length - 1; i++) {
            max_left = Math.max(max_left, height[i - 1]);
            int min = Math.min(max_left, max_rigth[i]);
            if(min > height[i]){
                sum = sum + (min - height[i]);
            }
        }
     return sum;
    }

}
