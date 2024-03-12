/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
abstract class base1{
    abstract class base2{
        abstract void display();
    }
}
class derived1 extends base1{
    class derived2 extends base2{
        void display(){
            System.out.println("called abstract method");
        }
    }
 
}
class lab8_ques5 {
    public static void main(String[] args){
        derived1 d=new derived1();
        derived1.derived2 dd=d.new derived2();
        dd.display();
    } 
}
