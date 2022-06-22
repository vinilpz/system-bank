package entities;

public abstract class Accont {

    protected Integer number;
    protected String holder;
    protected static Double balance;
    protected static Double withdrawLimit;
    protected Integer transfLimit;

    public Accont() {
    }

    public Accont(Integer number, String holder, Double balance, Double withdrawLimit, Integer transfLimit) {
        this.number = number;
        this.holder = holder;
        Accont.balance = balance;
        Accont.withdrawLimit = withdrawLimit;
        this.transfLimit = transfLimit;
    }

    public Integer getTransfLimit() {
        return transfLimit;
    }

    public void setTransfLimit(Integer transfLimit) {
        this.transfLimit = transfLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        Accont.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        Accont.withdrawLimit = withdrawLimit;
    }


    public abstract void deposit(Double amount);

    public abstract void withdraw(Double amount);

    public abstract void transfer(Double amount);

    public abstract String getBankInformation(String bankName, String agence);

}
