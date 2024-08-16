package EX_04082024;

import java.util.SplittableRandom;

public class BankAccount {

    String bankName;
    int Balance;
    String bankcode;


    BankAccount(){
        bankName = "SBI";
        Balance = 0;
        bankcode = "SBI0003";

    }

    BankAccount (String BName, int bal, String bcode){

        this.bankName = BName;
        this.Balance = bal;
        this.bankcode = bcode;

    }

    void  details(){

        System.out.println("Bank Name is => "+ bankName);
        System.out.println("Balance is => "+ Balance);
        System.out.println("Bank code is => "+ bankcode);
    }
}
