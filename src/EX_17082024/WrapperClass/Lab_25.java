package EX_17082024.WrapperClass;

public class Lab_25 {

    public static void main(String[] args) {

        Bank bank = new Bank("INR",2000);
        Bank bank1 = new Bank("INR",300);

        Integer total = bank.add(bank1);

        System.out.println(total);
    }
}
