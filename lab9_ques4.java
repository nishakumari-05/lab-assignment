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
class lab9_ques4 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a,b;int flag=0,c=0;
        System.out.println("enter first string : ");
        a=in.next();
        System.out.println("enter second string : ");
        b=in.next();
        int k=a.length();
        int m=b.length();  
        if(k==m){
            for(int i=0;i<k;i++){
                c=0;
                for(int j=0;j<m;j++){
                    if(a.charAt(i)==b.charAt(j)){
                        flag=0;
                        c++;
                        continue;
                    }
                }
                if(c==0){
                    flag=1;
                    break;
                }
                else
                    continue;
            }
        }
        else{
            flag=1;
        }
        if(flag==0){
            System.out.println("it is anagram");
        }
        else{
            System.out.println("it is not anagram");
        }
        
    }
    
}
