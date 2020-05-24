package com.company.oneWeek.operation;

import java.util.Arrays;

/**
 * 移动零
 */
public class MoveZeroes {

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes2(new int[]{1, 0, 3, 3,0, 4});
    }

    //暴力法
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = j; i < nums.length; ++i) {
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    //一次遍历
    public void moveZeroes2(int[] nums) {
        if (nums == null) return;
        int j = 0;//两个指针i和j
        for (int i = 0; i < nums.length; i++){
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if(nums[i] != 0){
                int tmp=nums[i];
                nums[i] =nums[j];
                nums[j++]=tmp;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
