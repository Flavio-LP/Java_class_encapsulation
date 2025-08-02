import br.com.bank_account.*;
import java.util.Scanner;

import br.com.pet_shop.PetShop;
import br.com.pet_shop.PetShopOperation;
import util.So;
import br.com.car.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        Account account = new Account();
        Account_Operation acc_op = new Account_Operation();
        Car carro = new Car(false,0,0);
        Car_Operation caroperation = new Car_Operation();
        PetShop petShop = new PetShop();
        PetShopOperation petShopOperation = new PetShopOperation();
        So so = new So();
        boolean menu = true;
        int opcao;

        while( menu){

            so.LimpaTerminal();

            try {
                System.out.println("----------------------");
                System.out.println("- Selecione a opção: -");
                System.out.println("- 1 - Conta Bancaria -");
                System.out.println("- 2 - Carro          -");
                System.out.println("- 3 - Petshop        -");
                System.out.println("- 4 - Sair           -");
                System.out.println("----------------------");
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Digite um número!");
                return;
            }



            switch (opcao){
                case 1:
                    System.out.println("Conta");
                    acc_op.ProcessaConta(account);
                    break;
                case 2:
                    System.out.println("Carro");
                    caroperation.ProcessaCarro(carro);
                    break;
                case 3:
                    petShopOperation.ProcessaPetShop(petShop);
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

}