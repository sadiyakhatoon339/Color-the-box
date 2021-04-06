/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color_the_box;
import java.io.*;
import java.util.StringTokenizer;
/**
 *
 * @author DELL
 */
public class Color_the_box {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer tk=new StringTokenizer(br.readLine());
          int N=Integer.parseInt(tk.nextToken());
          int M=Integer.parseInt(tk.nextToken());
          double S=0,f=1,g;
         for(double i=1;i<=M;i++)
         {
             f=f*i;
         }
         g=Math.pow(10,9)+7;
         
         S=(f+(N-M)*M)%g;
         System.out.println((int)S);
        // TODO code application logic here
    }
    
}
