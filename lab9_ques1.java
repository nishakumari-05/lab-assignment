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
class lab9_ques1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n,k,m,a;String b,l;
        System.out.println("enter no. of elements");
        n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++){
            System.out.println("enter element to be added");
            k=in.nextInt();
            arr.add(k);
        }
        System.out.println("elements of integer arraylist");
        for(int i=0;i<n;i++){
            m=arr.get(i);
            System.out.print(+m+" ");
        }
        System.out.println();
        System.out.println("enter no. of elements in string arraylist");
        a=in.nextInt();
        ArrayList<String>ar=new ArrayList<String>(a);
        for(int i=1;i<=a;i++){
            System.out.println("enter string to be added");
            b=in.next();
            ar.add(b);
        }
        System.out.println("elements of string arraylist : ");
        for(int i=0;i<a;i++){
            l=ar.get(i);
            System.out.print(l+" ");
        }
        System.out.println();
        arr.set(0, 12);
        System.out.println(arr);
        System.out.println("\n"+arr.remove(2));
        Collections.sort(arr);
        Collections.sort(ar);
        System.out.println("sorted array"+arr);
        System.out.println(ar);
    }
}
