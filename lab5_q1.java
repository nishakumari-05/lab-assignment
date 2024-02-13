/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
class Bird {
    void fly(){
        System.out.println("This bird fly");
    }
}
class Parrot extends Bird{
    void showColor(){
        System.out.println(  "the clour of the parrot is :" +"green");     
   }
}
class Crow extends Bird{
    String colour ="black";
    void showColor(){
        System.out.println("The colour of the crow is:"+colour);
    }
}
class main{  
    public static void main(String[] args) {
        Parrot P=new Parrot();
        Crow C=new Crow();
        P.showColor();
        C.showColor();
        P.fly();
        C.fly();
        
       
    }
    
}
