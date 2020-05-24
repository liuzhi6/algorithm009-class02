package com.company.oneWeek.operation;

/**
 * 旋转数组
 */
public class Rotate {

    public static void main(String[] agrs) {
        Rotate r = new Rotate();

    }

    // 暴力法
    public void rotate2(int[] nums, int k) {
        int temp;
        int previous;

        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
            System.out.println(previous);
        }
    }

    //环状替换
    public void rotate(int [] nums,int k){
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current =start;
            int prev = nums[start];
            do{
                int next = (current + k ) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            }while(start != current);
        }

    }


}