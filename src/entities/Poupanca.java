package entities;

import validations.Validations;

public class Poupanca extends Accont implements DeductionService {

    public Poupanca(Integer number, String holder, Double balance, Double withdrawLimit, Integer transfLimit) {
        super(number, holder, balance, withdrawLimit, transfLimit);
    }

    public Poupanca() {

    }

    @Override
    public void deposit(Double amount) {
        Validations.validateDeposit(amount);
        Accont.balance += amount;
    }

    @Override
    public void withdraw(Double amount) {
        Validations.validateWithdraw(amount, balance, Accont.withdrawLimit);
        Accont.balance -= amount;
    }

    @Override
    public void transfer(Double amount) {
        Validations.validateTransfer(getTransfLimit());
        balance -= (amount + TransfService.tax(amount, new Poupanca()));
    }

    @Override
    public String getBankInformation(String bankName, String agence) {
        return "Nome do banco: " + bankName + "Numero da agencia: " + agence;
    }

    @Override
    public double deduction(Double amount) {
        return amount * 0.09;
    }

}
