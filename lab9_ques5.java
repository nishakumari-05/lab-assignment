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
public class lab9_ques5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a,b="";
        System.out.println("enter string : ");
        a=in.next();
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println("second string : " +b);
    }
    
}
