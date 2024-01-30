/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author acer
 */
import java.util.*;
class student{
   int student_roll;
   String student_name;
   int student_marks[]=new int[5];
  
   student(int r,String nm,int[] marks)
   {
       this.student_roll=r;
       this.student_name=nm;
       int s=0;
       for(int i=0;i<5;i++)
       {
           this.student_marks[i]=marks[i]; 
           s=s+student_marks[i];
       }
       double avg=s/5;
       System.out.println("name= " +student_name);
       System.out.println("roll= " +student_roll);
       System.out.println("average= " +avg);
      
   }
}
class lab4_q4 {
    public static void main(String[] args)
    {
        student s=new student(3,"nisha",new int[]{10,12,13,14,15});
        student at=new student(4,"madhu",new int[]{12,13,14,15,16});
        student st=new student(5,"harsh",new int[]{13,13,14,15,17});
    
    }
}
