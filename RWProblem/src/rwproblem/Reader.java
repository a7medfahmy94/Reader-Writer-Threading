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

public class Reader extends Thread{
    private Buffer buf;
    String name;
    
    public Reader(){};
    public Reader(String n,Buffer b){buf=b;name=n;}
    
    
    public void run(){
        buf.read(name);
    }
    
}
