package com.company.oneWeek.operation;


/**
 * 删除重复数据
 */
public class RemoveDuplicates {
    public static void main(String [] args){
        RemoveDuplicates rd =new RemoveDuplicates();
        int i = rd.removeDuplicates(new int[]{2, 3, 2, 2, 3});
        System.out.println(i);
    }
    //双指针
    public int removeDuplicates(int [] nums){
        int len = nums.length;
        if(len < 2 ) return len;
        int i =0; // 定义指针 i 指向去重后数组对应索引。
        for (int j =1;j < len;j++){ // 从第二个元素开始遍历，判断是否和 i 指向元素重复
            if(nums[j] != nums[i]){ // 如果重复则继续遍历，否则去重。
                nums[++i]=nums[j]; // 将遍历到的不重复元素对应到去重后位置。
            }
        }
        return i + 1; // 最后去重后数组的长度为去重后最后一个元素的索引 i + 1
    }

}
