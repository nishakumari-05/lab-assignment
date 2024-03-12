/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
abstract class phone{
    abstract void call();
    abstract void sms();
}
interface camera{
    void click();
    void record();
}
interface musicplayer{
    void play();
    void pause();
    void stop();
}
class smartphone extends phone implements camera,musicplayer{
    void call(){
        System.out.println("call");
    }
    void sms(){
        System.out.println("sms");
    }
    public void click(){
        System.out.println("click");
    }
    public void record(){
        System.out.println("record");
    }
    public void play(){
        System.out.println("play");
    }
    public void pause(){
        System.out.println("pause");
    }
    public void stop(){
        System.out.println("stop");
    }
}
class lab8_ques6 {
    public static void main(String[] args){
        smartphone s=new smartphone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.play();
        s.pause();
        s.stop();
    }
}
