/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
interface sd{
    void call();
}
interface nd{
    default void call(){
        System.out.println("called default method");
    }
}
class child implements sd,nd{
    public void call(){
        System.out.println("called abstract method");
    }
    void def(){
        
    }
}
public class lab8_ques7 {
    public static void main(String[] args){
        child b=new child();
        b.call();
        b.def();
        b.call();
    }
}
