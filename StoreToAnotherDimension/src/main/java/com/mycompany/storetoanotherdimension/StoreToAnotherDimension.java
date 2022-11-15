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
ublic class StoreJOp {
        public static String again, pick, how_many;
        public static int discount = 1;
        public static int choose, quantity = 1;
        public static double total = 0, pay;
         public static float type;
        
        
         public static void GOODSHEESH() {
 JOptionPane.showMessageDialog(null,"1. SHABU       $. 5000 \n 2. MARIJUANA        $. 2000 \n 3. COCAINE      $. 3000 \n 4. RUGBY           $. 50 \n 5. VULCA SEAL   $. 150"  );
            
JOptionPane.showMessageDialog(null,"PROMO \n $ 10000 or more, get 1 set of paraphernalia tools \n $ 20000 or more, get 1 set of paraphernalia and 1 box of Flakka Drugs \n NOTE: You can only get Flakka Drugs when you avail on our promo \n +You can avail both promos at the same time+");
           
JOptionPane.showMessageDialog(null,"DISCOUNTS \n D1 - Membership discount ( 10% off ) \n D2 - First purchase discount ( 5% off )");
        }

        public static void list1() {
            switch (choose) {
                case 1:
                    System.out.println(quantity + "SHABU");
                case 2:
                    System.out.println(quantity + "MARIJUANA");
                case 3:
                    System.out.println(quantity + "COCAINE");
                case 4:
                    System.out.println(quantity + "RUGBY");
                case 5:
                    System.out.println(quantity + "VULCA");
                default: {
                }
            }
        }

        public static void list2() {
            switch (choose) {
                case 1:
                    System.out.println(quantity + "SHABU");
                case 2:
                    System.out.println(quantity + "MARIJUANA");
                case 3:
                    System.out.println(quantity + "COCAINE");
                case 4:
                    System.out.println(quantity + "RUGBY");
                case 5:
                    System.out.println(quantity + "VULCA");
                default: {
                }
            }
        }

        public static void list3() {
            switch (choose) {
                case 1:
                    System.out.println(quantity + "SHABU");
                case 2:
                    System.out.println(quantity + "MARIJUANA");
                case 3:
                    System.out.println(quantity + "COCAINE");
                case 4:
                    System.out.println(quantity + "RUGBY");
                case 5:
                    System.out.println(quantity + "VULCA");
                default: {
                }
            }
        }

        public static void list4() {
            switch (choose) {
                case 1:
                    System.out.println(quantity + "SHABU");
                case 2:
                    System.out.println(quantity + "MARIJUANA");
                case 3:
                    System.out.println(quantity + "COCAINE");
                case 4:
                    System.out.println(quantity + "RUGBY");
                case 5:
                    System.out.println(quantity + "VULCA");
                default: {
                }
            }
        }

        public static void list5() {
            switch (choose) {
                 case 1:
                    System.out.println(quantity + "SHABU");
                case 2:
                    System.out.println(quantity + "MARIJUANA");
                case 3:
                    System.out.println(quantity + "COCAINE");
                case 4:
                    System.out.println(quantity + "RUGBY");
                case 5:
                    System.out.println(quantity + "VULCA");
                default: {
                }
            }
        }

        public static void order() {
            System.out.println("");
            System.out.println("Enter 6: CANCEL");
           pick = JOptionPane.showInputDialog("WHAT IS YOUR ORDER?: ");
          choose = Integer.parseInt(pick);

            switch (choose) {

                case 1:
                     JOptionPane.showMessageDialog(null, "You chose SHABU");
                  how_many = JOptionPane.showInputDialog("HOW MANY?: ");
               type = Float.parseFloat(how_many);
                    total = total + (type * 5000);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "You chose Beluga MARIJUANA");
                      JOptionPane.showInputDialog("HOW MANY?: ");
                    total = total + (quantity * 2000);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "You chose Fourchu COCAINE");
                   JOptionPane.showInputDialog("HOW MANY?: ");
                    total = total + (quantity * 3000);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "You chose RUGBY");
                   JOptionPane.showInputDialog("HOW MANY?: ");
                    total = total + (quantity * 50);
                    break;

                case 5:
                   JOptionPane.showMessageDialog(null, "You chose VULCA SEAL");
                   JOptionPane.showInputDialog("HOW MANY?: ");
                    total = total + (quantity * 150);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("INVALID PARAMETER");
                    order();
                    break;
            }

            if (total >= 10000) {
                System.out.println("You have 1 set of paraphernalia tools");
            }
            if (total >= 20000) {
                System.out.println("You have 1 set of paraphernalia and 1 box of Flakka Drugs(exclusive)!");
            }

            System.out.println("");
             JOptionPane.showInputDialog("DO YOU WANNA BUY MORE? \n Enter [1] if Yes and [2] if No: ");
            if (again.equalsIgnoreCase("1")) {
                order();
            } else {
                System.out.println("Discounts Available");
                System.out.println(" Discount 1 - Membership discount ( 10% off )");
                System.out.println(" Discount 2 - First Purchase discount ( 5% off )");
                System.out.println(" Note: Discounts cannot be stacked");
                System.out.println("");
                System.out.println("Press 3 if none");
                JOptionPane.showInputDialog("Enter discount number: ");
                if (discount == 1) {
                    total = total * 0.90;
                }
                if (discount == 2) {
                    total = total * 0.95;
                }
                if (discount == 3) {
                    System.out.println("No discount");
                    total = total - 0;
                }
                do {
                    System.out.println("");
                    System.out.println("TOTAL PRICE IS $ " + total + "0");
                    JOptionPane.showInputDialog("Enter Cash: ");
                    

                    if (pay < total) {
                        System.out.println("INSUFFICIENT CASH, PLEASE ENTER THE EXACT AMOUNT");
                        JOptionPane.showInputDialog("Enter Cash: ");
                       

                    }

                } while (pay < total);
                if (pay >= total) {
                    total = pay - total;
                    System.out.println("TOTAL CHANGE IS $" + total + "0");
                }
                System.out.println("DO YOU WANNA BUY AGAIN?");
                 JOptionPane.showInputDialog("Enter [1] if Yes and [2] if No: ");
                if (choose == 1) {
                 JOptionPane.showMessageDialog(null,"1. SHABU       $. 5000 \n 2. MARIJUANA        $. 2000 \n 3. COCAINE      $. 3000 \n 4. RUGBY           $. 50 \n 5. VULCA SEAL   $. 150"  );
            
JOptionPane.showMessageDialog(null,"PROMO \n $ 10000 or more, get 1 set of paraphernalia tools \n $ 20000 or more, get 1 set of paraphernalia and 1 box of Flakka Drugs \n NOTE: You can only get Flakka Drugs when you avail on our promo \n +You can avail both promos at the same time+");
           
JOptionPane.showMessageDialog(null,"DISCOUNTS \n D1 - Membership discount ( 10% off ) \n D2 - First purchase discount ( 5% off )");
                    total = total - total;
                    GOODSHEESH();
                } else {
                    System.exit(0);
                }
            }
        }

     public static void main(String[] args) {
            GOODSHEESH();
            order();
        }
