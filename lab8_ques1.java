/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
class outer{
    void displayouter(){
        System.out.println("in outer display");
        class inner{
            void displayinner(){
                System.out.println("in inner display");
            }
            
        }
        inner i=new inner();
        i.displayinner();
    }
    static class inn{
        static void dstatin(){
            System.out.println("in static inner display");
        }
    }
}
public class lab8_ques1 {
     public static void main(String[] args){
        outer out=new outer();
        out.displayouter();
        outer.inn.dstatin();
    } 
}
