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
public class lab2_q4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array : ");
       int n = sc.nextInt();
       int []arr = new int[n];
       System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       System.out.println("Enter the element to be searched in the array :");
       int element = sc.nextInt();
       int flag = 0,k=0;
       for(int i=0;i<n;i++)
        {
            if(arr[i]==element)
            {
                flag = 1;
                k=i;
                break;
            }
        }
       if(flag==0)
       {
            System.out.println("The element is not present in the array ");
       }
       else
           System.out.println("The element is present in the array at position" +(k+1));
    }
}
