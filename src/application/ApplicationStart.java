package application;

import entities.Corrente;
import entities.DeductionService;
import entities.Poupanca;
import entities.TransfService;
import validations.BusinessValidations;
import validations.Validations;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationStart {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        System.out.println("Informe seus dados:");

        System.out.print("Numero: ");
        Integer number = input.nextInt();

        System.out.print("Titular: ");
        input.nextLine();
        String holder = input.nextLine();

        System.out.print("Saldo inicial: ");
        double balance = input.nextDouble();

        System.out.print("Limite de saque: ");
        double withdrawLimit = input.nextDouble();

        System.out.print("Limite de transferencia diaria: ");
        Integer transfLimit = input.nextInt();

        Poupanca acc = new Poupanca(number, holder, balance, withdrawLimit, transfLimit);


        int opc = 0;
        do {
            System.out.println("Qual operacao deseja realizar? ");
            System.out.println(" 1 - Saque ");
            System.out.println(" 2 - Deposito ");
            System.out.println(" 3 - Transferencia ");
            System.out.println(" 4 - Qual meu banco e minha agencia?");
            System.out.println(" 5 - Atualizar limite de saque");
            System.out.println(" 6 - Informacoes pessoais");
            System.out.println(" 7 - Sair ");
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Informe uma quantia para sacar: ");
                    double amount = input.nextDouble();
                    try {
                        acc.withdraw(amount);
                        System.out.println("Novo saldo: " + acc.getBalance());
                    } catch (Validations exception) {
                        System.out.println(exception);
                    }
                    break;

                case 2:
                    System.out.println("Informe uma quantia para depositar: ");
                    amount = input.nextDouble();
                    acc.deposit(amount);
                    System.out.println("Novo saldo: " + acc.getBalance());
                    break;

                case 3:
                    System.out.println("Informe uma quantia para transferir: ");
                    amount = input.nextDouble();
                    try {
                        acc.transfer(amount);
                        System.out.println("Transferencia realizada!");
                        System.out.println("Valor taxado: " + TransfService.tax(amount, acc));
                        System.out.println("Novo saldo: " + acc.getBalance());
                    } catch (BusinessValidations e){
                        System.out.println(e);
                    }

                    break;

                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("Informacoes do seu banco: ");
                    String result = acc.getBankInformation("Bradesco", "00339");
                    System.out.println(result);
                    System.out.println("---------------------------------");
                    break;

                case 5:
                    System.out.print("Informe o novo valor para o limite de saque: ");
                    withdrawLimit = input.nextDouble();
                    acc.setWithdrawLimit(withdrawLimit);
                    System.out.println("Novo limite de saque: " + acc.getWithdrawLimit());
                    break;
                case 6:
                    System.out.println("Informacoes da sua conta: ");
                    System.out.println("------------------------------");
                    System.out.println("Nome do titular: " + acc.getHolder());
                    System.out.println("Numero da conta: " + acc.getNumber());
                    System.out.println("Saldo atual: " + acc.getBalance());
                    System.out.println("Limite de saque atual: " + acc.getWithdrawLimit());
                    System.out.println(acc.getBankInformation("Bradesco", "0033"));
                    System.out.println("-----------------------------");
                    break;

                case 7:
                    System.out.println("Voce finalizou a operacao");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Erro: alternativa invalida.");
            }

        } while (true);

    }

}