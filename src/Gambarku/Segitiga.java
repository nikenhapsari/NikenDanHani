/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gambarku;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Segitiga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Masukin x   = ");
        x = input.nextInt();
        
        System.out.println("-----------------");
        System.out.println("Jika x =" + x);
        System.out.println("Maka Hasilnya  ");
        System.out.println("=====================");
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=====================");
    }
}
