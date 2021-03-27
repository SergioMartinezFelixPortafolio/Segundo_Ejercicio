/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segundo_ejercicio;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class Segundo_Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Welcome to my second program");
        Scanner reader = new Scanner(System.in);
        System.out.println("How many bits weight your file? ");
        long nBits = reader.nextLong();
        float kylobyte = 1024;
        float megabyte = (kylobyte * 1024);
        float gigabyte = (megabyte * 1024);
        float terabyte = (gigabyte * 1024);
        System.out.println("The weight of your file in bits is " + nBits);
        System.out.println("The weight of your file in kylobytes is " + nBits / kylobyte);
        System.out.println("The weight of your file in megabytes is " + nBits / megabyte);
        System.out.println("The weight of your file in terabytes is " + nBits / terabyte);
        boolean primero = ((nBits / megabyte) > (10 * nBits / megabyte));
        System.out.println("Is your file heavier than 10Megabytes? " + primero);
        System.out.println("See you soon!!");

    }

}
