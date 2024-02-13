/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
import java.util.*;
class student{
    String Student_name;
    int Student_roll;
    int Student_fee;
    student(String name,int roll,int fee){
        this.Student_name=name;
        this.Student_roll=roll;
        this.Student_fee=fee;
    }
    public void display(){
        System.out.println("student name : " +this.Student_name);
        System.out.println("student roll : " +this.Student_roll);
        System.out.println("student fee : " +this.Student_fee);
    }  
}
class lab6_ques1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        student st=new student("nisha",5,1000);
        student s=new student("xyz",6,1000);
        st.display();
        s.display();
        
    }
}
