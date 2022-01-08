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
public class javaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1[] = new String[3];
        int x[] = new int[3];

        for (int i = 0; i < s1.length; i++) {
            s1[i] = sc.next();
            x[i] = sc.nextInt();
        }

        System.out.println("");
        System.out.println("================================");
        for (int i = 0; i < s1.length; i++) {
            System.out.printf("%-15s %03d %n", s1[i], x[i]);
        }

        System.out.println("================================");

    }
}
