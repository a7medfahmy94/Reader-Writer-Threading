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
public class Semaphore {
    private int c,initial;
    public Semaphore(){c = 0;}
    public Semaphore(int i){c=initial=i;}
    
    public void decrement(){c--;}
    
    public void increment(){c++;}
    
    public synchronized void P(int n,String a,String b){
        System.out.println(a);
        if(c-n < 0){
            try{
                System.out.println(b);
                wait();
            }catch(InterruptedException e){}
        }
        c-=n;
    }
    
    public synchronized void V(int n,String a){
        c+=n;
        if(c == initial){notify();}
        System.out.println(a);
    }
    
}
