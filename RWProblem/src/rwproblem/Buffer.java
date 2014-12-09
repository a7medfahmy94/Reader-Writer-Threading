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
public class Buffer {
    private String text;
    private int readers;
    private Semaphore rw;
    public Buffer(){}
    
    public Buffer(String init,int n){
        text=init;
        readers=Math.max(n,1);
        rw = new Semaphore(readers);
    }
    
    
    public void write(String name,String t){
        rw.P(readers,name + " Start write",name + " Blocked");
        text += t;
        rw.V(readers,name + " Finished write " + text);
    }
    public String read(String name){
        rw.P(1,name + " Start read",name + " Blocked");
        String ret = text;
        rw.V(1,name + " Finish read " + text);
        return ret;
    }
}


