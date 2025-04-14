package Ex30_Exceptions;

class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) {

        if (bankName.currency.equals("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CurrencyMisMatchCustomException("Currency MisMatch!");
            } catch (CurrencyMisMatchCustomException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}

class CurrencyMisMatchCustomException extends Exception{
    CurrencyMisMatchCustomException(String msg){
        super(msg);
    }
}

class NotValidAgeException extends Exception{
    NotValidAgeException(String e){
        super(e);
    }
}
public class Lab016_Custom_Exception {

    public static void main(String[] args) {

        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 123);
        Bank jp_chase = new Bank("USD", 101);
        int total = sbi.add(icici);
        System.out.println(sbi.getAmount());
       // int total = sbi.add(jp_chase);
        System.out.println(total);


    }
}