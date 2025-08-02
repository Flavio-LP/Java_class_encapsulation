package br.com.pet_shop;

import br.com.car.Car;
import util.So;

import java.util.Scanner;

public class PetShopOperation {


    public void ProcessaPetShop(PetShop petshop){

        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        So so = new So();
        int Opcao;

        while (menu){

            try{
            System.out.println("---------------------------");
            System.out.println("--   PetShop Manager     --");
            System.out.println("- 1- Dar banho no pet     -");
            System.out.println("- 2- Abastercer c/Agua    -");
            System.out.println("- 3- Abastercer c/Shampoo -");
            System.out.println("- 4- Verif. água          -");
            System.out.println("- 5- Verif. Shampoo       -");
            System.out.println("- 6- Verif. uso da maqúina-");
            System.out.println("- 7- Colocar pet          -");
            System.out.println("- 8- Remover pet          -");
            System.out.println("- 9- Limpar máquina       -");
            System.out.println("------------------------");

            so.LimpaTerminal();

            Opcao = scanner.nextInt();}
            catch (Exception e) {
                System.out.println("Digite um número!");
                return;
            }

            switch (Opcao){
                case 1:
                    petshop.RealizarBanho();
                    break;
                case 2:
                    petshop.AdicionaAgua();
                    break;
                case 3:
                    petshop.AdicionaShampoo();
                    break;
                case 4:
                    petshop.VerificarAgua();
                    break;
                case 5:
                    petshop.VerificarShampoo();
                    break;
                case 6:
                    if (petshop.VerificarPet()){
                        System.out.println("Há um pet na máquina!");
                    }else{
                        System.out.println("Maquina vazia!");
                    }
                    break;
                case 7:
                    petshop.AdicionarPet();
                    break;
                case 8:
                    petshop.RemoverPet();
                    break;
                case 9:
                    petshop.LimparMaquina();
                    break;
                default:
                    menu = false;
                    break;
            }

        }

    }
}
