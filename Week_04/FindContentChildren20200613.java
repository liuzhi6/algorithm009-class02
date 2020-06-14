package com.company.fourWeek.operation;

import java.util.Arrays;

public class FindContentChildren20200613 {

    public static void main(String[] args) {
        FindContentChildren20200613 f= new FindContentChildren20200613();
        System.out.println(f.findContentChildren(new int[]{1,2,3}, new int [] {1,1}));
    }

    public int findContentChildren(int [] grid,int [] size){
        if(grid == null || size == null) return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0 ,si = 0;
        while (gi < grid.length && si < size.length){
            if(grid[gi] <= size[si]){
                gi++;
            }
            si++;
        }
        return gi;
    }
}
