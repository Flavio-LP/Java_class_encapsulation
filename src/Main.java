import br.com.bank_account.Account;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        Account account = new Account();
        boolean menu = true;
        int opcao;

        while( menu){

            LimpaTerminal();
            
            System.out.println("----------------------");
            System.out.println("- Selecione a opção: -");
            System.out.println("- 1 - Conta Bancaria -");
            System.out.println("- 2 - Carro          -");
            System.out.println("- 3 - Petshop        -");
            System.out.println("- 4 - Sair           -");
            System.out.println("----------------------");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Conta");
                    ProcessaConta(account);
                    break;
                case 2:
                    System.out.println("Carro");
                    break;
                case 3:
                    System.out.println("Petshop");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    menu = false;
                default:
                    System.out.println("Opção inválida");
            }
        }



    }

    public static void ProcessaConta(Account account){
        boolean menu = true;
        var scanner = new Scanner(System.in);
        int opcao;
        double valor;

        System.out.println("Digite um valor para abrir sua conta");
        valor = scanner.nextDouble();
        account.setSaldo(valor);
        account.setChequeEspecial();

        LimpaTerminal();



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

            LimpaTerminal();

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
                    if (account.SacarDinheiro(valor)){
                        System.out.println("Valor sacado!");
                    } else{
                        System.out.println("Valor não sacado!");
                    }
                    break;
                case 5:
                    System.out.println("x");
                    break;
                case 6:
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

    public static void LimpaTerminal(){
        
            try{
                if (System.getProperty("os.name").contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } else {
                    Runtime.getRuntime().exec("clear");
                }
            }catch(Exception e){
                System.err.println("Erro ao limpar o console: " + e.getMessage());
            }
    }
}