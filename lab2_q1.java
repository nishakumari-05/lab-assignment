/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;

/**
 *
 * @author nisha
 */

import java.util.*;
public class Assignment {

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
        System.out.println("Size of array : " +sizeOfArray);
        System.out.println("number of elements in array : " +numberOfElements);
    }
}
