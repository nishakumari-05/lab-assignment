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
public class lab9_ques10 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a,b;int flag=0;
        System.out.println("enter first string : ");
        a=in.next();
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(i)==a.charAt(a.length()-1-i)){
                flag=0;
                continue;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("String is palendrome");
        else
            System.out.println("String is not palendrome");
        
        System.out.println("enter second string : ");
        b=in.next();
        for(int i=0;i<b.length()/2;i++){
            if(b.charAt(i)==b.charAt(b.length()-1-i)){
                flag=0;
                continue;
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("String is palendrome");
        else
            System.out.println("String is not palendrome");
        System.out.println(a+b);
    }
    
}
