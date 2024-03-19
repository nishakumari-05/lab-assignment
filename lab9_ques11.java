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
public class lab9_ques11 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a,b,c;int flag=0,m;
        System.out.println("enter three string : ");
        a=in.next();
        b=in.next();
        c=in.next();
        m=c.length();
        int k=a.length()-m;
        int j=b.length()-m;
        if((a.substring(k).equals(c)) && (b.substring(j).equals(c))){
            System.out.println("true");
        }
        else
            System.out.println("false");
    }  
}
