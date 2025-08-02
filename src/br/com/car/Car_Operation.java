package br.com.car;

import util.So;

import java.util.Scanner;

public class Car_Operation {


    public void ProcessaCarro(Car carro){

        boolean menu = true;
        Scanner scanner = new Scanner(System.in);
        So so = new So();
        int Opcao;
        int OpcaoDirecao;
        int OpcaoMarcha;

        while (menu){


            System.out.println("------------------------");
            System.out.println("--     Car Manager    --");
            System.out.println("- 1- Ligar veiculo     -");
            System.out.println("- 2- Desligar veiculo  -");
            System.out.println("- 3- Acelerar          -");
            System.out.println("- 4- Diminuir veloc.  -");
            System.out.println("- 5- Entrar em:        -");
            System.out.println("- 6- Verif. Velocidade -");
            System.out.println("- 7- Trocar marcha     -");
            System.out.println("------------------------");

            so.LimpaTerminal();

            Opcao = scanner.nextInt();

            switch (Opcao){
                case 1:
                    carro.LigarCarro();
                    break;
                case 2:
                    carro.DesligarCarro();
                    break;
                case 3:
                    carro.Acelerar();
                    break;
                case 4:
                    carro.Desacelerar();
                    break;
                case 5:
                    System.out.println("---------------");
                    System.out.println("- Virar para: -");
                    System.out.println(" 1- Esquerda  -");
                    System.out.println(" 2- Direita   -");
                    System.out.println("---------------");
                    OpcaoDirecao = scanner.nextInt();
                    carro.Direcionar(OpcaoDirecao);
                    break;
                case 6:
                    System.out.println("A velocidade do carro é: " + carro.GetVelocidade());
                    break;
                case 7:
                    System.out.println("------------------");
                    System.out.println("- Trocar marcha: -");
                    System.out.println(" 1- aumentar     -");
                    System.out.println(" 2- Diminuir     -");
                    System.out.println("------------------");
                    OpcaoMarcha = scanner.nextInt();
                    carro.TrocarMarcha(OpcaoMarcha);
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println("Finalizando controle do carro!");
                    carro = null;
                    menu = false;
                    break;
            }

        }

    }

}
