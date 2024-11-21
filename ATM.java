package basicproject;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 4567, balance = 0, withdraw, deposite;
        System.out.println("enter your pin");
        pin = sc.nextInt();
        while (pin == 4567) {
            System.out.println("atm machine");
            System.out.println("choose your option");
            System.out.println("1.for withdraw");
            System.out.println("2. for deposite");
            System.out.println("3. for check balance");
            System.out.println("4.exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter money for withdraw");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your money");
                    } else {
                        System.out.println("insufficint balance");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("enter money for deposite");
                    deposite = sc.nextInt();
                    balance += deposite;
                    System.out.println("your money has succesfully deposited");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("balance " + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("exit");
                    ;
            }
        }
    }
}

