package br.com.bank_account;
import java.util.Scanner;
import util.So;


public class Account_Operation {

    public void ProcessaConta(Account account){
        boolean menu = true;
        var scanner = new Scanner(System.in);
        So so = new So();

        int opcao;
        double valor;

        System.out.println("Digite um valor para abrir sua conta");
        valor = scanner.nextDouble();
        account.setSaldo(valor);
        account.setChequeEspecial();

       so.LimpaTerminal();



        while (menu){

           

            System.out.println("-----------------------------");
            System.out.println("- Bem vindo ao java banking -");
            System.out.println("- Selecione a opção:        -");
            System.out.println("- 1 - Consultar Saldo       -");
            System.out.println("- 2 - Consultar Cheque Esp. -");
            System.out.println("- 3 - Depositar Saldo       -");
            System.out.println("- 4 - Sacar Saldo           -");
            System.out.println("- 5 - Pagar Boleto          -");
            System.out.println("- 6 - Verif. Cheque Esp.    -");
            System.out.println("- 7 - Sair                  -");
            System.out.println("-----------------------------");
            opcao = scanner.nextInt();

            //so.LimpaTerminal();

            switch(opcao){
                

                case 1: 
                    System.out.println("Seu saldo é: " + account.getSaldo());
                    break;
                case 2:
                    System.out.println("Seu limite de cheque especial é: " + account.getLimiteChequeEspecial());
                    System.out.println("Seu cheque especial é: " + account.getChequeEspecial());
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja depositar:");
                    valor = scanner.nextDouble();
                    account.DepositarSaldo(valor);
                    account.AtualizaConta();
                    System.out.println("Saldo depositado");
                    break;
                case 4:
                    System.out.println("Digite o valor que deseja sacar:");
                    valor = scanner.nextDouble();
                    if (account.RealizaOperacao(valor)){
                        System.out.println("Valor sacado!");
                    } else{
                        System.out.println("Valor não sacado!");
                    }
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto que deseja sacar:");
                    valor = scanner.nextDouble();
                    if (account.RealizaOperacao(valor)){
                        System.out.println("Boleto pago!");
                    } else{
                        System.out.println("Boleto não sacado!");
                    }
                    break;
                case 6:
                    if (account.VerificaUsoChequeEsp()){
                        System.out.println("Cheque especial ativo, valor: " + account.getChequeEspecial() * -1);
                    } else{
                        System.out.println("Cheque especial não ativo");
                    }
                    System.out.println("-----");
                    break;
                case 7:
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    menu = false;
                    break;
                
            }

        }


    }
}
