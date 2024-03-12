/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
interface a{
    int num=5;
    default void  s1(){
        System.out.println("called default method");
    }
    static void call(){
        System.out.println("called static method");
    } 
}
class ch implements a{
    
}

class lab8_ques8 {
    public static void main(String[] args){
        
        ch c=new ch();
        c.s1();
        System.out.println(a.num);
        a.call();
    }
}
