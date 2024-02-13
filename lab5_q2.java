/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
class Parent {
    void showParents(){
    System.out.println("This is the parent class");
    }
}
class Child extends Parent{
      void showChild(){
          System.out.println( "This is the child class");
      }
}
class lab5_q2{
    public static void main(String[] args) {
        Child c =new Child();
        c.showChild();
        c.showParents();
        
    }
    
}