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
class emp{
    public int employee_id;
    private String employee_name;
    protected String employee_department;
    
    public void employee(String emp_name)
    {
        this.employee_name=emp_name;   
    }
    public String Display()
    {
        return employee_name;
    }
   
}
class lab4_q1 
{
    public static void main(String[]args)
    {
        emp n=new emp();
        n.employee_id=1234;
        n.employee("nisha");
        n.employee_department="Mnc";
        System.out.println(n.employee_id); 
        System.out.println(n.Display()); 
        System.out.println(n.employee_department); 
    }
}
