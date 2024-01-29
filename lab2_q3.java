/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class lab2_q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numberOfElements,sizeOfArray;
        System.out.println("Enter array size");
        sizeOfArray=in.nextInt();
        int[] arr=new int[sizeOfArray];
        System.out.println("Enter number of elements in array");
        numberOfElements=in.nextInt();
        System.out.println("enter array elements:");
        for(int i=0;i<numberOfElements;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter position where element has to be deleted");
        int loc=in.nextInt();
        for(int i=loc;i<numberOfElements;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println("new array");
        for(int i=0;i<numberOfElements-1;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
