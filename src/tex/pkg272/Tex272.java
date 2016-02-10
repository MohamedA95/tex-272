/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tex.pkg272;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author habi
 */
public class Tex272 {

    /**
     * @param args the command line arguments ``To be or not to be,'' quoth the Bard, ``that
     */
    public static void main(String[] args) throws IOException {
        boolean inside = false;
        //Scanner in = new Scanner(System.in);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        
        while((line = in.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            for(char c: line.toCharArray()) {
                if(c == '\"') {
                    if(inside) {
                        sb.append("\'\'");
                        inside = false;
                    } else {
                        sb.append("``");
                        inside = true;
                    }
                } else {
                    sb.append(c);
                }
                
            }
            System.out.println(sb.toString());
        }
        
    }
    
}
