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
    public static double x2 = 0, x_2, x5;
    public static int x3, x4;

    public static void GoodSheesh() {
        System.out.println("--------------------------------------------------");
        System.out.println("[SYSTEM]: A customer entered the store");
        System.out.println("--------------------------------------------------");
        System.out.println("[STORE CLERK]: SUP DUDE!, WELCOME TO THE STORE");
        System.out.println("WE CURRENTLY HAVE PROMOS HERE");
        System.out.println("IF YOU BUY 2 SAME EXACT ITEMS, YOU'LL GET A 10% DISCOUNT");
        System.out.println("IF YOU BUY 3 SAME EXACT ITEMS, YOU'LL GET A 20% DISCOUNT");
        System.out.println("JUST CHOOSE WHATEVER YOU WANT");
        System.out.println("========================================================");
        System.out.println("1: Shabu - $5000\n" + "2: Marijuana - $2000\n" + "3: Cocaine - $3000\n" + "4: Rugby - $150\n" + "5: Vulca Seal - $50");
        System.out.println("========================================================");
    }

    public static void order() {
        System.out.println("[CASHIER]: SUP BRO, WHAT DO YOU WANNA BUY? JUST CHOOSE");
        System.out.println("--------------------------------------------------");
        System.out.println("[SYSTEM]: Press [1] for Shabu, Press [2] for Marijuana, Press [3] for Cocaine, Press [4] for Rugby, Press [5] for Vulca Seal");
        System.out.println("--------------------------------------------------");
        System.out.print("[CASHIER]: Do you want to buy?, Just press the numbers: ");
        x1 = input.nextInt();

        if (x1 == 1) {
            System.out.println("--------------------------------------------------");
            System.out.println("The customer chose Shabu");
            System.out.println("--------------------------------------------------");
            System.out.print("[CASHIER]: How many Shabu's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 5000);

            if (x_1 == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("[CASHIER]: You want to buy again?");
            System.out.println("--------------------------------------------------");
            System.out.print("[SYSTEM]: Press [Y] if YES and [N] if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("--------------------------------------------------");
                System.out.print("[SYSTEM]: Enter cash payment: ");
                x_2 = input.nextDouble();
                if (x_2 >= x2) {
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                }
                if (x3 == 1) {
                    order();
                } else if (x3 == 2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Great, time to rest and chill");
                } else if (x_2 < x2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                    System.out.println("--------------------------------------------------");

                    System.out.println("[SYSTEM]: Add more money? press [1] if YES, press [2] if NAH");
                    x4 = input.nextInt();

                    if (x4 == 1) {
                        System.out.println("[SYSTEM]: How much do you wanna add?");
                        x5 = input.nextDouble();
                        x5 = x5 + x_2;
                    }
                    if (x5 >= x2) {
                        System.out.println("[SYSTEM]: Payment successful, cash is sufficient");
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Price: " + x5);
                        x5 = x5 - x2;
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Change: " + x5);
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                        x3 = input.nextInt();

                    }
                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    } else {
                        System.out.println("The store owner kicked the customer out of the store");
                    }

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    }
                }
            }
        } else if (x1 == 2) {
            System.out.println("--------------------------------------------------");
            System.out.println("The customer chose Marijuana");
            System.out.println("--------------------------------------------------");
            System.out.print("[CASHIER]: How many Marijuana's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 2000);

            if (x_1 == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("[CASHIER]: You want to buy again?");
            System.out.println("--------------------------------------------------");
            System.out.print("[SYSTEM]: Press [Y] if YES and [N] if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("--------------------------------------------------");
                System.out.print("[SYSTEM]: Enter cash payment: ");
                x_2 = input.nextDouble();
                if (x_2 >= x2) {
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                }
                if (x3 == 1) {
                    order();
                } else if (x3 == 2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Great, time to rest and chill");
                } else if (x_2 < x2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                    System.out.println("--------------------------------------------------");

                    System.out.println("[SYSTEM]: Add more money? press [1] if YES, press [2] if NAH");
                    x4 = input.nextInt();

                    if (x4 == 1) {
                        System.out.println("[SYSTEM]: How much do you wanna add?");
                        x5 = input.nextDouble();
                        x5 = x5 + x_2;
                    }
                    if (x5 >= x2) {
                        System.out.println("[SYSTEM]: Payment successful, cash is sufficient");
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Price: " + x5);
                        x5 = x5 - x2;
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Change: " + x5);
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                        x3 = input.nextInt();

                    }
                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    } else {
                        System.out.println("The store owner kicked the customer out of the store");
                    }

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    }
                }
            }

        } else if (x1 == 3) {
            System.out.println("--------------------------------------------------");
            System.out.println("The customer chose Cocaine");
            System.out.println("--------------------------------------------------");
            System.out.print("[CASHIER]: How many Cocane's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 3000);

            if (x_1 == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("[CASHIER]: You want to buy again?");
            System.out.println("--------------------------------------------------");
            System.out.print("[SYSTEM]: Press [Y] if YES and [N] if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("--------------------------------------------------");
                System.out.print("[SYSTEM]: Enter cash payment: ");
                x_2 = input.nextDouble();
                if (x_2 >= x2) {
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                }
                if (x3 == 1) {
                    order();
                } else if (x3 == 2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Great, time to rest and chill");
                } else if (x_2 < x2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                    System.out.println("--------------------------------------------------");

                    System.out.println("[SYSTEM]: Add more money? press [1] if YES, press [2] if NAH");
                    x4 = input.nextInt();

                    if (x4 == 1) {
                        System.out.println("[SYSTEM]: How much do you wanna add?");
                        x5 = input.nextDouble();
                        x5 = x5 + x_2;
                    }
                    if (x5 >= x2) {
                        System.out.println("[SYSTEM]: Payment successful, cash is sufficient");
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Price: " + x5);
                        x5 = x5 - x2;
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Change: " + x5);
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                        x3 = input.nextInt();

                    }
                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    } else {
                        System.out.println("The store owner kicked the customer out of the store");
                    }

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    }
                }

            }
        } else if (x1 == 4) {
            System.out.println("--------------------------------------------------");
            System.out.println("The customer chose Rugby");
            System.out.println("--------------------------------------------------");
            System.out.print("[CASHIER]: How many Rugbies do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 150);

            if (x_1 == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("[CASHIER]: You want to buy again?");
            System.out.println("--------------------------------------------------");
            System.out.print("[SYSTEM]: Press [Y] if YES and [N] if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("--------------------------------------------------");
                System.out.print("[SYSTEM]: Enter cash payment: ");
                x_2 = input.nextDouble();
                if (x_2 >= x2) {
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                }
                if (x3 == 1) {
                    order();
                } else if (x3 == 2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Great, time to rest and chill");
                } else if (x_2 < x2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                    System.out.println("--------------------------------------------------");

                    System.out.println("[SYSTEM]: Add more money? press [1] if YES, press [2] if NAH");
                    x4 = input.nextInt();

                    if (x4 == 1) {
                        System.out.println("[SYSTEM]: How much do you wanna add?");
                        x5 = input.nextDouble();
                        x5 = x5 + x_2;
                    }
                    if (x5 >= x2) {
                        System.out.println("[SYSTEM]: Payment successful, cash is sufficient");
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Price: " + x5);
                        x5 = x5 - x2;
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Change: " + x5);
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                        x3 = input.nextInt();

                    }
                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    } else {
                        System.out.println("The store owner kicked the customer out of the store");
                    }

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    }
                }
            }

        } else if (x1 == 5) {
            System.out.println("--------------------------------------------------");
            System.out.println("The customer chose Vulca Seal");
            System.out.println("--------------------------------------------------");
            System.out.print("[CASHIER]: How many Vulca Seal's do you want?: ");
            x_1 = input.nextInt();
            x2 = x2 + (x_1 * 50);

            if (x_1 == 2) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 10% discount");
                x2 = x2 * .90;
            } else if (x_1 == 3) {
                System.out.println("--------------------------------------------------");
                System.out.println("[CASHIER]: Thank you for availing on our promo, you got a 20% discount");
                x2 = x2 * .80;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("[CASHIER]: You want to buy again?");
            System.out.println("--------------------------------------------------");
            System.out.print("[SYSTEM]: Press [Y] if YES and [N] if NO: ");
            x = input.next();
            if (x.equalsIgnoreCase("Y")) {
                order();

            } else {
                System.out.println("--------------------------------------------------");
                System.out.print("[SYSTEM]: Enter cash payment: ");
                x_2 = input.nextDouble();
                if (x_2 >= x2) {
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                }
                if (x3 == 1) {
                    order();
                } else if (x3 == 2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Great, time to rest and chill");
                } else if (x_2 < x2) {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Insufficient cash");
                    System.out.println("--------------------------------------------------");

                    System.out.println("[SYSTEM]: Add more money? press [1] if YES, press [2] if NAH");
                    x4 = input.nextInt();

                    if (x4 == 1) {
                        System.out.println("[SYSTEM]: How much do you wanna add?");
                        x5 = input.nextDouble();
                        x5 = x5 + x_2;
                    }
                    if (x5 >= x2) {
                        System.out.println("[SYSTEM]: Payment successful, cash is sufficient");
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Price: " + x5);
                        x5 = x5 - x2;
                        System.out.println("--------------------------------------------------");
                        System.out.println("[SYSTEM]: Total Change: " + x5);
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                        x3 = input.nextInt();

                    }
                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    } else {
                        System.out.println("The store owner kicked the customer out of the store");
                    }

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Price: " + x2);
                    x2 = x_2 - x2;
                    System.out.println("--------------------------------------------------");
                    System.out.println("[SYSTEM]: Total Change: " + x2);
                    System.out.println("--------------------------------------------------");
                    System.out.println("[CASHIER]: Next customer please, press [1] to proceed otherwise press [2]");
                    x3 = input.nextInt();

                    if (x3 == 1) {
                        order();
                    } else if (x3 == 2) {
                        System.out.println("--------------------------------------------------");
                        System.out.println("[CASHIER]: Great, time to rest and chill");
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        GoodSheesh();
        order();
    }
}
