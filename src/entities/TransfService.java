package entities;

public class TransfService {

    public static double tax(Double amount, DeductionService deductionService) {
        amount = amount - deductionService.deduction(amount);
        return amount * 0.2;
    }

}
