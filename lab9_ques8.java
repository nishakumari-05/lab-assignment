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
public class lab9_ques8 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a,b;
        System.out.println("enter first string : ");
        a=in.next();
        System.out.println("enter second string : ");
        b=in.next();
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        if(a.compareTo(b)==0)
            System.out.println("strings are equal ");
        else
            System.out.println("strings are not equal");
    }
    
}
