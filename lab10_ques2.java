/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
class empl{
    private int eid;
    private String enm;
    private int age;
    private static int nextid=1;
    int c;
    public empl(String enm,int age){
        this.eid=nextid++;
        this.enm=enm;
        this.age=age;
        
    }
    public void show(){
        System.out.println("name= "+enm+"\t"+"employee id= "+eid+"\t"+"age= "+age);
    }
    public void showNextID(){
        System.out.println("Next employee id will be="+(eid+1));
        c=nextid;
    }
    public void total(){
        System.out.println("actual number of employee including interns= "+nextid);
    }
    public void left(){
        System.out.println("final count after interns have left= "+c);
    }
    protected void finalize(){
        --nextid;
    } 
}
public class lab10_ques2 {
    public static void main(String[] args){
        empl e=new empl("abc1",34);
        empl f=new empl("abc2",35);
        empl g=new empl("abc3",36);
        e.show();
        f.show();
        g.show();
        e.showNextID();
        f.showNextID();
        g.showNextID();
        {
            empl x=new empl("intern1",37);
            empl y=new empl("intern2",38);
            x.show();
            y.show();
            x.showNextID();
            y.showNextID();
            x=null;
            y=null;
            System.gc();
            System.runFinalization();
        }
        
        e.total();
        e.left();
    }
    
}
