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
public class lab10_ques4 {
    public static void method(int x)
    {
        if (x<0)
            throw new IllegalArgumentException("age is not valid");
        System.out.println("age is " +x);
    }
    public static void main(String[] args){
        try{
            method(15);
        }
        catch(IllegalArgumentException e){
            throw new RuntimeException("it will generate runtime exception " +e.getMessage());
        }
    } 
}
