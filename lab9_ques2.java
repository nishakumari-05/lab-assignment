/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
import java.util.ArrayList;
import java.util.*;
class lab9_ques2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,k,m,a;
        System.out.println("enter no. of elements");
        n=in.nextInt();
        ArrayList<Integer>arr1=new ArrayList<Integer>(n);
        ArrayList<Integer>arr2=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++){
            System.out.println("enter element to be added");
            k=in.nextInt();
            arr1.add(k);
        }
        System.out.println("for second arraylist:");
        for(int i=1;i<=n;i++){
            System.out.println("enter element to be added");
            k=in.nextInt();
            arr2.add(k);
        }
        if(arr1.equals(arr2)){
            System.out.println("arraylisrs are equal");
        }
        else{
            System.out.println("arraylists are not equal");
        }
        ArrayList<Integer>arr3=new ArrayList<Integer>(n);
        arr1.addAll(arr2);
        arr3=arr1;
        System.out.println("joined array : " +arr3);
        System.out.println("enter value to be searched");
        m=in.nextInt();
        System.out.println(arr3.contains(m));

    }
}
