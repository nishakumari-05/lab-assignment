/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class lab10_ques1 {
    public void finalize(){
        System.out.println("object collected");
    }
    public static void main(String[] args){
        lab10_ques1 m1=new lab10_ques1();
        lab10_ques1 m2=new lab10_ques1();
//        m1=m2;
        m1=null;
        m2=null;
        System.gc();
    }
    
}
