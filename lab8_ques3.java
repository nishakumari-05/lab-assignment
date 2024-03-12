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
abstract class Shapee{
    abstract void perimeter();
    abstract void area();
}
class Circle extends Shapee{
    int r;
    Circle(int r){
        this.r=r;
    }
    void perimeter(){
        double p=2*3.14*r;
        System.out.println("perimeter of circle = " +p);
    }
    void area(){
        double a=3.14*r*r;
        System.out.println("area of circle = " +r);
    }
    
}
class rect extends Shapee{
    int l,b;
    rect(int l, int b){
        this.l=l;
        this.b=b;
    }
    void perimeter(){
        double p=2*(l+b);
        System.out.println("perimeter of rectangle = " +p);
    }
    void area(){
        double a=l*b;
        System.out.println("area of rectangle = " +a);
    }
}
class lab8_ques3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Circle c=new Circle(5);
        c.perimeter();
        c.area();
        rect r=new rect(2,4);
        r.perimeter();
        r.area();
        
    }
}
