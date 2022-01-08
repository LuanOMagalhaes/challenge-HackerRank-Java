/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengers;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class JavaIfElse {


    public static void main(String[] args) {      
        Scanner scan  = new Scanner(System.in);

        int n = scan.nextInt();

        if (n % 2 != 0){
            System.out.println("Weird");
        } else if(n >=2 && n <=5){
            System.out.println("Not Weird");
        } else if (n >=6 && n <=20){
            System.out.println("Weird");
        }else if (n > 20){
            System.out.println("Not Weird");
        }

        scan.close();
    }
    
}
