package com.company;

import java.util.Scanner;

/**
 * Created by lcb on 2018/11/4.
 */
public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("学生的得分是：");
        int score=sc.nextInt();
        String level="";
        switch (score/10){
            case 9:level="A";break;
            case 8:level="B";break;
            case 7:level="c";break;
            default:level="默认值";break;
        }
        System.out.print("等级是："+level);
        return;


    }
}
