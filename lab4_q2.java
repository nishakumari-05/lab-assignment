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
class car {
    String brand="ford";   
    public String getBrand()
    {
        return brand;
    }
    
}
class lab4_q2{
    public static void main(String[] args)
    {
        car c=new car();
        System.out.println(c.getBrand());
        
    }
}