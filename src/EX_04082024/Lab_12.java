package EX_04082024;

import java.util.Scanner;

public class Lab_12 {

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();

        Scanner sc =  new Scanner(System.in);


        System.out.println("Enter the Bank name: ");
        String BName = sc.next();
        System.out.println("Enter the Balance: ");
        int bal = sc.nextInt();
        System.out.println("Enter the Bank Code: ");
        String bcode = sc.next();

        BankAccount baboi = new BankAccount(BName,bal,bcode);
        baboi.details();

        sc.close();
    }

}
