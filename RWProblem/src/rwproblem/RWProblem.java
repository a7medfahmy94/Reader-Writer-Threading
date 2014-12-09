/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rwproblem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fahmy
 */
public class RWProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Initial buffer:");
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int readers , writers;
        System.out.println("# of readers:");
        readers = in.nextInt();
        System.out.println("# of writers:");
        writers = in.nextInt();
        in.nextLine();
        Buffer buf = new Buffer(t,readers);
        ArrayList<Reader> r = new ArrayList<>();
        ArrayList<Writer> w = new ArrayList<>();
        System.out.println("Readers:");
        for(int i = 0 ; i < readers; i++){
            r.add(new Reader(in.nextLine(),buf));
        }
        System.out.println("Writers:[name] [text]");
        for(int i = 0 ; i < writers; i++){
            String[] s = in.nextLine().split(" ");
            w.add(new Writer(s[0],s[1],buf));
        }
        for(int i = 0 ;i  < readers; i++){
            r.get(i).start();
        }
        for (int i = 0; i < writers; i++) {
            w.get(i).start();
        }
    }
    
}
