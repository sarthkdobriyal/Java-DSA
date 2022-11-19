package variablesdatatypes;

import java.util.Scanner;

/**
 * first
 */
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
       float pencil = sc.nextFloat();
       float pen = sc.nextFloat();
       float eraser = sc.nextFloat();
        
       float total = pencil + pen + eraser;

       float gst = 0.18f * total;
    
       float billAmount = total + gst;

       System.out.println("Total bill amounts to: " + billAmount);

       
       sc.close();
    }
    
}