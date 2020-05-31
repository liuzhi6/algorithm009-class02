package com.company.oneWeek.twoSum20200520;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        System.out.println(Arrays.toString(t.twoSum2(new int[]{2, 3, 9, 11, 15}, 20)));
    }

    ////比较map里面是否包含target-sums数组中的值，没有则放入map有直接return下标
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -2};
    }

    public int[] twoSum2(int[] sum, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sum.length; i++) {
            if (map.containsKey(target - sum[i])) {
                return new int[]{map.get(target - sum[i]), i};
            }
            map.put(sum[i], i);
        }
        return new int[]{-1, -2};
    }


}
