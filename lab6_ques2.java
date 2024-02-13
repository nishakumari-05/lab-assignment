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
class Student{
    String Student_name;
    int Student_roll;
    int Student_fee;
    Student(String name,int roll,int fee){
        this.Student_name=name;
        this.Student_roll=roll;
        this.Student_fee=fee;
    }
    Student(){
        this("xyz",20,10000);
    }
    public void display(){
        System.out.println("student name : " +this.Student_name);
        System.out.println("student roll : " +this.Student_roll);
        System.out.println("student fee : " +this.Student_fee);
        show(this);
        
    }  
    public void show(Object obj){
        System.out.println("show has been called");
    }
}
class lab6_ques2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Student st=new Student("nisha",5,1000);
        Student s=new Student();
        st.display();
        s.display();
        
       
        
        
    }
}


