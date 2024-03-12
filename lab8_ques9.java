/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
interface helper{
    void help();
} 
interface classhelper extends helper{
    void cls();
}
class help implements classhelper,helper{
    public void cls(){
        System.out.println("called class help");
    }
    public void help(){
        System.out.println("called help");
    }
    
}
public class lab8_ques9 {
    public static void main(String[] args){
        help c=new help();
        c.cls();
        c.help();
    }
}
