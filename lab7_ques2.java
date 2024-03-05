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
class circle{
    double radius;
    double area(double radius){
        double a= 2*3.14*radius;
        return a;
    }
   
    double circumference(){
        double cir=(2*3.14*radius);
        return cir;
    }
}
class cylinder extends circle{
    double h;
    void volume(double h){
        double a=super.area(3);
        System.out.println("volume of cylinder" +2*a*h);  
    }
    void ar(){
        double ar=super.area(4);
        double ci=super.circumference();
        System.out.println("volume of cylinder" +(ci*h + ar)); 
    }
}
class lab7_ques2 {
     public static void main(String[]args){
        circle c=new circle();
        System.out.println("area of circle : " +c.area(10));
        cylinder cc=new cylinder();
        cc.volume(4);
        cc.area(3);
        
    }
}
