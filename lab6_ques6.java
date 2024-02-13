/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
import java.util.*;
class Wrap{
    int num=10;
    int view(){
        return this.num=num+10;
    }
 
}
public class lab6_ques6 {
    public static void main(String[] args){
        Wrap w=new Wrap();
        System.out.println(w.view());
    }
    
}
