/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
interface person{
    int a=10;
    static void call(){
        System.out.println("called static method");
    } 
    void name();
    void age();
}
class employee implements person{
    public void name(){
        System.out.println("nisha");
    }
    public void age(){
        System.out.println("19");
    }
}
class lab8_ques4 {
    public static void main(String[] args){
        employee b=new employee();
        b.name();
        b.age();
        System.out.println(person.a);
        person.call();
    }
}
