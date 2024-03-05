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
class rectangl{
    int l,b;
    rectangl(){
        l=1;
        b=1;
    }  
    rectangl(int l,int b){
        this.l=l;
        this.b=b;
    }  
}
class cuboid extends rectangl{
    int h;
    cuboid(){
        super(3,4);
        this.h=1;
    }
    cuboid(int h){
        super(3,4);
        this.h=h;
    }
    int volume(){
        int v=l*b*h;
        return v;
    }
} 


class lab7_ques3 {
    public static void main(String[]args){
        cuboid s=new cuboid();
        System.out.println("volume 1 : " +s.volume());
        cuboid r=new cuboid(3);
        System.out.println("volume : "+r.volume());
    }
    
}

    

