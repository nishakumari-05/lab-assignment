/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author nisha
 */
import java.util.*;
class lab3_q2 {
    public void valid(String s)
    {
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if((x>='a' && x<='z')||(x>='A' && x<='Z'))
                continue;
            else{
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("NOT A VALUD NAME");
        else
            System.out.println("A VALID NAME");
    }
    public void valid(int a){
        if(a>3 && a<15)
            System.out.println("AGE IS VALID");
        else
            System.out.println("AGE IS NOT VALID");
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        lab3_q2 v=new lab3_q2();
        System.out.println("enter name");
        String str=in.next();
        v.valid(str);
        System.out.println("enter age");
        int a=in.nextInt();
        v.valid(a);
    }
}
