package entities;

import validations.Validations;

public class Corrente extends Accont implements DeductionService {

    public Corrente(Integer number, String holder, Double balance, Double withdrawLimit, Integer transfLimit) {
        super(number, holder, balance, withdrawLimit, transfLimit);
    }

    public Corrente() {

    }

    @Override
    public void deposit(Double amount) {
        Validations.validateDeposit(amount);
        balance += amount;
    }

    @Override
    public void withdraw(Double amount) {
        Validations.validateWithdraw(amount, balance, Accont.withdrawLimit);
        balance -= amount;
    }

    @Override
    public void transfer(Double amount) {
        Validations.validateTransfer(getTransfLimit());
        balance -= (amount + TransfService.tax(amount, new Corrente()));
    }

    @Override
    public String getBankInformation(String bankName, String agence) {
        return null;
    }


    @Override
    public double deduction(Double amount) {
        return amount * 0.11;
    }

}
