package com.company.fourWeek;

import java.util.ArrayList;
import java.util.List;
//全排列
public class Permute202008 {


    public static void main(String[] args) {
        int [] nums ={1,2,3};
        Permute202008 p = new Permute202008();
        List<List<Integer>> lists = p.permute(nums);
        System.out.println(lists);
    }

    public List<List<Integer>> permute(int [] nums){
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len == 0) return res;
        boolean [] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        des(nums,len,0,path,used,res);
        return res;
    }

    private void des(int[] nums, int len, int depth, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        if(depth == len ){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i< len;i++){
            if(!used[i]){
                path.add(nums[i]);
                used[i] = true;
                des(nums,len,depth+ 1,path,used,res);
                used[i] =false;
                path.remove(path.size() - 1);
            }
        }
    }


}
