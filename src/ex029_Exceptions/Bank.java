package ex029_Exceptions;

public class Bank {
  private  String currency;
   private Integer amount;

    public Bank(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
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

    public Integer add(Bank bankName){
        if(bankName.currency.equalsIgnoreCase("INR")){
            return bankName.amount + this.amount;
        }else{
            try {
                throw new CustomException("Currency Mismatch ..Can't proceed!");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

//to handle exception for currency mismatch
class CustomException extends Exception{
    CustomException( String msg){
        super(msg);
    }
}
