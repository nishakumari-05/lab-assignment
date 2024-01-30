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
class Student{
   int student_roll;
   String student_name;
   int student_marks[]=new int[]{0,0,0,0,0};
   Student()
   {
       this.student_roll=0;
       this.student_name="unknown";
   }
   Student(int r,String nm,int[] marks)
   {
       this.student_roll=r;
       this.student_name=nm;
       for(int i=0;i<5;i++)
           this.student_marks[i]=marks[i];
   }   
   void display()
   {
       System.out.println("name= " +student_name);
       System.out.println("roll= " +student_roll);
       System.out.println("student marks= ");
       for(int i=0;i<5;i++)
        System.out.println(student_marks[i]);
   }
}
class lab4_q3{
    public static void main(String[] args)
    {
        Student s=new Student(3,"nisha",new int[]{10,12,13,14,15});
        Student at=new Student();
        s.display();
        at.display();
       
    }
}
    
