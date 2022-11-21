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
public class Kji {
public static String again, pick, how_many, which, payment;
    public static int discount = 1, one, two;
    public static int choose, quantity = 1, x;
    public static double total = 0, pay;
    public static float type;

    public static void GOODSHEESH() {
        JOptionPane.showMessageDialog(null, "1. SHABU - $5000 \n 2. MARIJUANA - $2000 \n 3. COCAINE - $3000 \n 4. RUGBY - $50 \n 5. VULCA SEAL - $150");

        JOptionPane.showMessageDialog(null, "PROMO \n $ 10000 or more, get 1 set of paraphernalia tools \n $ 20000 or more, get 1 set of paraphernalia and 1 box of Flakka Drugs \n NOTE: You can only get Flakka Drugs when you avail on our promo \n +You can avail both promos at the same time+");

        JOptionPane.showMessageDialog(null, "DISCOUNTS \n D1 - Membership discount ( 10% off ) \n D2 - First purchase discount ( 5% off )");
    }

    public static void order() {
        pick = JOptionPane.showInputDialog("1. SHABU       $. 5000 \n 2. MARIJUANA        $. 2000 \n 3. COCAINE      $. 3000 \n 4. RUGBY           $. 50 \n 5. VULCA SEAL   $. 150 \n Enter 6: EXIT SHOP \n WHAT IS YOUR ORDER?: ");
        choose = Integer.parseInt(pick);

        switch (choose) {

            case 1:
                JOptionPane.showMessageDialog(null, "You chose SHABU");
                how_many = JOptionPane.showInputDialog("HOW MANY?: ");
                type = Float.parseFloat(how_many);
                total = total + (type * 5000);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "You chose MARIJUANA");
                how_many = JOptionPane.showInputDialog("HOW MANY?: ");
                type = Float.parseFloat(how_many);
                total = total + (quantity * 2000);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "You chose COCAINE");
                how_many = JOptionPane.showInputDialog("HOW MANY?: ");
                type = Float.parseFloat(how_many);
                total = total + (quantity * 3000);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "You chose RUGBY");
                how_many = JOptionPane.showInputDialog("HOW MANY?: ");
                type = Float.parseFloat(how_many);
                total = total + (quantity * 50);
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "You chose VULCA SEAL");
                how_many = JOptionPane.showInputDialog("HOW MANY?: ");
                type = Float.parseFloat(how_many);
                total = total + (quantity * 150);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "Ka mahal, uli nalang ko :)");
                System.exit(0);

            default:
                JOptionPane.showMessageDialog(null, "NO ITEMS AVAILABLE");
                order();
                break;
        }

        if (total >= 10000) {
            JOptionPane.showMessageDialog(null, " Total spendings reached $10k, You got 1 set of paraphernalia tools");
        }
        if (total >= 20000) {
            JOptionPane.showMessageDialog(null, " Total spendings reached $20k, You also got 1 set of paraphernalia and 1 box of Flakka Drugs(exclusive)!");
        }

        pick = JOptionPane.showInputDialog("DO YOU WANNA BUY MORE? \n Enter [1] if Yes and [2] if No: ");
        choose = Integer.parseInt(pick);
        if (choose == 1) {
            order();
        }
        pick = JOptionPane.showInputDialog("TOTAL PRICE IS $" + total + "\n" + "Discounts Available: \n Discount 1 - Membership Discount ( 10% off ) \n Discount 2 - First Purchase Discount ( 5% off ) \n *Note: 1 discount can only be applied* \n Press [3] if none \n Enter discount number: ");
        choose = Integer.parseInt(pick);
        switch (choose) {

            case 1:
                total = total * 0.90;
                break;

            case 2:
                total = total * 0.95;
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "No discount");
                total = total - 0;
                break;

        }

        payment = JOptionPane.showInputDialog("TOTAL PRICE IS $ " + total + "\n" + "Enter Cash: ");
        x = Integer.parseInt(payment);
        switch (x) {

            case 1:
                do {
                 if (pay < total) {
                        JOptionPane.showInputDialog("INSUFFICIENT CASH, PLEASE ENTER THE EXACT AMOUNT \n Enter Cash: ");
                    }
                } while (pay < total);
                break;
       
        case 2:
      if (pay >= total) {
                    JOptionPane.showMessageDialog(null, "TOTAL CHANGE IS $" + total);
                  total = pay - total;
      }           
            break;
        }   
   
        JOptionPane.showMessageDialog(null, "PURCHASE COMPLETE!!!");
        pick = JOptionPane.showInputDialog("NEXT CUSTOMER? \n Enter [1] if Yes and [2] if No: ");
        choose = Integer.parseInt(pick);
        switch (choose) {

            case 1:
                total = total - total;
                order();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Leaving store...");
                System.exit(0);
                break;
        }
    }
    
    public static void main(String[] args) {
        GOODSHEESH();
        order();
    }
}

