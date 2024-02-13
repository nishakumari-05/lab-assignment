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
class printnumber{
    int num=10;
    Integer num1=new Integer(num);
    Double num2=new Double(num);
    Float num3=new Float(num);
    int num4=num1.intValue();
    double num5=num2.doubleValue();
    float num6=num3.floatValue();
    void auto(){
        System.out.println("Autoboxing");
        System.out.println(+num1+ "   " +num2+"   " +num3);
    }
    void unbox(){
        System.out.println("unboxing");
        System.out.println(+num4+ "   " +num5+"   " +num6);
    }
}
class lab6_ques5 {
    public static void main(String[] args){
        printnumber p=new printnumber();
        p.auto();
        p.unbox();
        
    }
}
