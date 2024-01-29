/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

/**
 *
 * @author nisha
 */
import java.util.*;
public class lab2_q5 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array : ");
       int n = sc.nextInt();
       int []arr = new int[n];
       System.out.println("Enter array elements:");
       int i,j;
       int count=0,flag = 1;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag = 0;
                    count++;
                    System.out.println("The duplicate element is "+arr[i]);
                }    
            }
        }
        if(flag==1)
        {
           System.out.println("No duplicate element is present in the array : "); 
        }
        System.out.println("The frequency of ocurrence of duplicate element is "+count);
   }
}
