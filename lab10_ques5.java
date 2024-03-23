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
public class lab10_ques5 {
    public static void main(String[] args){
        try{
            try{
                try{
                    int arr[]={1,2,3};
                    System.out.println(+arr[3]);
                }
                catch(ArithmeticException e){
                    System.out.println(e.getMessage());
                }
                
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("array size problem");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
