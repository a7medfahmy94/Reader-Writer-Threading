/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rwproblem;

/**
 *
 * @author fahmy
 */
public class Writer extends Thread{
    private Buffer buf;
    private String name,text;
    
    public Writer(){}
    public Writer(String n,String t,Buffer b){buf=b;name=n;text=t;}
    
    public void run(){
        buf.write(name,text);
        
    }
}
