/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricky
 */
import  java.util.Scanner;
public class testt {
    public static void main (String [] args) {
       
        
        int age;
        double child = 13.45;
        double adult = 21.95;
        double senior = 18.95;
        
        Scanner sc = new Scanner(System.in);
        
            while (true) {
                System.out.println("Please input your age: ");
                age = sc.nextInt();
                if (age < 1 || age > 125) {
                    System.out.println("ERROR! Invalid input!Please input your age again: ");
                    age = sc.nextInt();
                }
                  break;
                }
              
                if (age < 18)
                    System.out.println ("Your fee is $" + child);
                else if (age <65)
                    System.out.println ("Your fee is $" + adult);
                else
                    System.out.println ("Your fee is $" + senior);
                    
        
        }
        
        
        
    
}
    

