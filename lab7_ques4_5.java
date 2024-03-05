/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
class base{
    int a=10;
    void display()
    {
        System.out.println("method 1");
        
    }
}
class derived extends base{
    int a=5;
    void display(){
        System.out.println("in derived");
        System.out.println(super.a);
        System.out.println(this.a);
    }
    void show(){
        System.out.println("in der");
    }
}
class ba extends base{
    void show(){
        System.out.println("in der");
    }
}
class NewClass {
    public static void main(String[] args){
        base b=new base();
        base b1=new derived();
        base c=new ba();
        b.display();
        b1.display();
       
        
    }
    
    
    
}
