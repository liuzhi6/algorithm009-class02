package com.company.fourWeek;

import java.util.LinkedList;
//广度优先遍历
public class NumIslands20200612 {

    private int rows;
    private int cols;

    public int numIslangds(char[] [] grid){
        int [] [] directions ={{-1,0},{0,-1},{1,0},{0,1}};
        rows = grid.length;
        if(rows == 0){
            return 0;
        }
        cols = grid[0].length;
        boolean [] [] marked =new boolean[rows][cols];
        int count = 0;
        for(int i =0; i< rows;i++){
            for (int j =0; j< cols;j++){
                if(!marked[i][j] && grid[i][j] == '1'){
                    count++;
                    LinkedList<Integer> queue = new LinkedList<>();
                    queue.addLast(i * cols + j);
                    marked[i][j] = true;
                    while(!queue.isEmpty()){
                        int cur = queue.removeFirst();
                        int curX = cur / cols;
                        int curY = cur % cols;
                        for(int k = 0; k < 4; k++){
                            int newX = curX + directions[k][0];
                            int newY = curY + directions[k][1];
                            if(inArea(newX,newY) &&grid[newX][newY] == '1' && !marked[newX][newY]){
                                queue.add(newX * cols + newY);
                                marked[newX][newY] = true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < rows && y >=0 && y <cols ;
    }


    public static void main(String[] args) {
        NumIslands20200612 solution2 = new NumIslands20200612();
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int numIslands1 = solution2.numIslangds(grid1);
        System.out.println(numIslands1);


    }

}
