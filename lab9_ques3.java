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
class lab9_ques3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,k,a;
        System.out.println("enter no. of elements");
        n=in.nextInt();
        ArrayList<Integer>arr1=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++){
            System.out.println("enter element to be added");
            k=in.nextInt();
            arr1.add(k);
        }
         System.out.println("Minimum " +Collections.min(arr1));
        System.out.println("Maximum " +Collections.max(arr1));
        System.out.println("Enter element to be removed :");
        a=in.nextInt();
        arr1.remove(Integer.valueOf(a));
        System.out.println(arr1);
    }
    
}
