package EX_17082024.WrapperClass;


public class Bank {
    private String currency;
    private  Integer amount;

    public String getCurrency(){

        return currency;
    }

    public String setCurrency(String currency){

        this.currency = currency;
        return currency;

    }

    public Integer getAmount(){


        return amount;

    }
    public Integer setAmount(Integer amount){

        this.amount = amount;
        return amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }


    public  Integer add (Bank bankname){

        Integer sum = this.amount + bankname.amount;
        return sum;
    }
}
