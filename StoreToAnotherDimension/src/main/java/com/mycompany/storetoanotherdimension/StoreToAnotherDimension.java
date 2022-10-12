/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.storetoanotherdimension;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

/**
 *
 * @author ADMIN
 */
public class StoreToAnotherDimension {

    public static Scanner input = new Scanner(System.in);
    public static String x;
    public static int x1, x_1 = 1;
    public static double x2 = 0, x_2;
    

    public static void GoodSheesh() {
        System.out.println("SUP DUDE!, WELCOME TO THE STORE");
        System.out.println("WE CURRENTLY HAVE PROMOS HERE");
        System.out.println("IF YOU BUY 2 SAME EXACT ITEMS, YOU'LL GET A 10% DISCOUNT");
        System.out.println("IF YOU BUY 3 SAME EXACT ITEMS, YOU'LL GET A 20% DISCOUNT");
        System.out.println("JUST CHOOSE WHATEVER YOU WANT");

        System.out.println("1: Shabu - 5000Php\n" + "2: Marijuana - 2000Php\n" + "3: Cocaine - 3000Php\n" + "4: Rugby - 150Php\n" + "5: Vulca Seal - 50Php");

    }

    public static void order() {
        System.out.println("Press 1 for Shabu, Press 2 for Marijuana, Press 3 for Cocaine, Press 4 for Rugby, Press 5 for Vulca Seal");
        System.out.print("Do you want to buy?, Just press the numbers: ");
        x1 = input.nextInt();

        if (x1 == 1) {
            System.out.println("You choose Shabu");
            System.out.print("How many Shabu's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 5000);
            
             if (x_1 == 2){
                System.out.println("Thank you for availing on our promo, you got a 10% discount");
            x2 = x2 * .90;
            }
             else if (x_1 == 3){
                System.out.println("Thank you for availing on our promo, you got a 20% discount");
            x2 = x2 * .80;
            }
            System.out.println("You want to buy again?");
            System.out.print("Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                    System.out.println("Insufficient cash");
                } else {
                    System.out.println("Total Price" + x2);
                    x2 = x_2 - x2;
                    System.out.println("Total Change" + x2);

                }
            }

        } else if (x1 == 2) {
            System.out.println("You choose Marijuana");
            System.out.print("How many Marijuana's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 2000);
            
             if (x_1 == 2){
                System.out.println("Thank you for availing on our promo, you got a 10% discount");
            x2 = x2 * .90;
            }
 else if (x_1 == 3){
                System.out.println("Thank you for availing on our promo, you got a 20% discount");
            x2 = x2 * .80;
            }
            System.out.println("You want to buy again?");
            System.out.print("Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                    System.out.println("Insufficient cash");
                } else {
                    System.out.println("Total Price" + x2);
                    x2 = x_2 - x2;
                    System.out.println("Total Change" + x2);
                }
            }
        } else if (x1 == 3) {
            System.out.println("You choose Cocaine");
            System.out.print("How many Cocane's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 3000);
            
             if (x_1 == 2){
                System.out.println("Thank you for availing on our promo, you got a 10% discount");
            x2 = x2 * .90;
            }
 else if (x_1 == 3){
                System.out.println("Thank you for availing on our promo, you got a 20% discount");
            x2 = x2 * .80;
            }
            System.out.println("You want to buy again?");
            System.out.print("Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                    System.out.println("Insufficient cash");
                } else {
                    System.out.println("Total Price" + x2);
                    x2 = x_2 - x2;
                    System.out.println("Total Change" + x2);

                }
            }
        } else if (x1 == 4) {
            System.out.println("You choose Rugby");
            System.out.print("How many Rugbies do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 150);
            
             if (x_1 == 2){
                System.out.println("Thank you for availing on our promo, you got a 10% discount");
            x2 = x2 * .90;
            }
 else if (x_1 == 3){
                System.out.println("Thank you for availing on our promo, you got a 20% discount");
            x2 = x2 * .80;
            }
            System.out.println("You want to buy again?");
            System.out.print("Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                    System.out.println("Insufficient cash");
                } else {
                    System.out.println("Total Price" + x2);
                    x2 = x_2 - x2;
                    System.out.println("Total Change" + x2);

                }
            }
        } else if (x1 == 5) {
            System.out.println("You choose Vulca Seal");
            System.out.print("How many Vulca Seal's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 50);
            
            if (x_1 == 2){
                System.out.println("Thank you for availing on our promo, you got a 10% discount");
            x2 = x2 * .90;
            }
 else if (x_1 == 3){
                System.out.println("Thank you for availing on our promo, you got a 20% discount");
            x2 = x2 * .80;
            }
            System.out.println("You want to buy again?");
            System.out.print("Press Y if YES and N if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {

                System.out.println("Enter cash payment");
                x_2 = input.nextDouble();
                if (x_2 <= x2) {
                    System.out.println("Insufficient cash");
                } else {
                    System.out.println("Total Price" + x2);
                    x2 = x_2 - x2;
                    System.out.println("Total Change" + x2);
                    
                     
                
                }
            }
        }
    }

    public static void main(String[] args) {
        GoodSheesh();
        order();
    }
}
