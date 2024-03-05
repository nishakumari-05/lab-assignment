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
class Shape{
    int area;
    int getArea(int area){
        return area;
    }
}
class Rectangle extends Shape{
    int l,b;
    int getArea(int l,int b){
        this.l=l;
        this.b=b;
        int rec=l*b;
        return rec;
    }    
}
class Box extends Rectangle{
    int h;
    int getArea(int h){
        super.getArea(2,3);
        int sa=l*b*h;
        return sa;
    }
} 

class lab7_ques1 {
    public static void main(String[]args){
        Shape s=new Shape();
        System.out.println("area of shape : " +s.getArea(10));
        Rectangle r=new Rectangle();
        System.out.println("area of rectangle : "+r.getArea(4,6));
        Box b=new Box();
        System.out.println("surface area of box : "+b.getArea(5));
    }
    
}
