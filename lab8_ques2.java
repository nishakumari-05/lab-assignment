/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
abstract class bike{
    abstract void run();
}
class honda extends bike{
    void run(){
        System.out.println("new bike");
    }
}
class lab8_ques2 {
    public static void main(String[] args){
        bike b=new honda();
        b.run();
    }
}