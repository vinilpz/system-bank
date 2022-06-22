package validations;

public class Validations extends BusinessValidations {

    public static void validateWithdraw(Double amount, Double balance, Double widrawLimit) {

        if (amount > balance) {
            throw new BusinessValidations("Erro de saque: saldo insuficiente!");
        }
        if (amount > widrawLimit) {
            throw new BusinessValidations("Erro de saque: excedeu o limite de saque!");
        }
    }

    public static void validateDeposit(Double amount) {
        if (amount <= 0) {
            throw new BusinessValidations("Erro de deposito: valor invalido!");
        }
    }

    public static void validateTransfer(Integer transfLimit) {
        if (transfLimit <= 0) {
            throw new BusinessValidations("Erro de transferencia: Limite diario atingido!");
        }
    }

}
