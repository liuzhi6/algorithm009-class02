package com.company.fourWeek.operation;


import javax.xml.bind.SchemaOutputResolver;

/**
 * 柠檬水找零 - 贪心算法
 */
public class LemonadeChange20200613 {


    public static void main(String[] args) {
        LemonadeChange20200613 l = new LemonadeChange20200613();
        System.out.println(l.lemonadeChange(new int []{5,5,5,10,20}));
    }

    public boolean lemonadeChange(int [] bills){
        int five = 0, ten = 0;
        for(int bill :bills){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five == 0) return false;
                five --;
                ten ++;
            }else {
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five -=3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }



}
