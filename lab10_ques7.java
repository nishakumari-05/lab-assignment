/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
import java .util.*;
class MyException extends Exception 
{
   public MyException(String s){
       super(s);
    }
}
public class lab10_ques7 {
    static void validate(int age){
        if(age<0)
            throw new MyException("age cannot be zero");
        else
            System.out.println("age is valid");
    }
    public static void main(String[] args){
        try{
            validate(-15);
        }
        catch(MyException e){
            System.out.println(" my exception ");
        }
    }
}
