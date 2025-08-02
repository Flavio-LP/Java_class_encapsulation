package br.com.car;

import java.sql.SQLOutput;

public class Car {

    private boolean status;
    private int velocidade;
    private int marcha;

    public Car(boolean status, int velocidade, int marcha) {
    }


    public boolean GetStatus(){
        return this.status;
    }


    public int GetVelocidade(){
        return this.velocidade;
    }


    public int GetMarcha(){
        return this.marcha;
    }

    public void LigarCarro(){
        if (this.status){
            System.out.println("Carro já está ligado!");
            return;
        }
        this.status = true;
        System.out.println("Carro foi ligado!");

    }


    public boolean VerificaCarro(){

       if (!this.status){
           System.out.println("Veiculo desligado!");

           if (this.marcha != 0 || this.velocidade != 0){
               if(this.marcha != 0){
                   System.out.println("Veiculo está com a marcha engatada!");
                   return false;
               } else{
                   System.out.println("Velocidade maior que 0");
                   return false;
               }
           }

           return false;
       }
       return true;

    }

    public void DesligarCarro(){
        if (!VerificaCarro()){
            System.out.println("Carro continua ligado!");
        }else{
            System.out.println("Carro desligado!");
        }
    }

    public void Acelerar(){

        if(!VerificaCarro()){
            System.out.println("Velocidade não aplicada!");
        } else{

            System.out.println("velocidade: "+ this.velocidade);
            System.out.println("marcha: " + this.marcha);

            if(this.marcha == 0 ){
               this.marcha++;
               this.velocidade++;
               //System.out.println("Marcha trocada!");
               //System.out.println("Velocidade aplicada!");
               return;
            }

            if (this.marcha == 1){

                if (this.velocidade < 20 ){
                    this.velocidade++;
                    System.out.println("Velocidade aplicada!");
                }else{
                    System.out.println("Velocidade máxima atingida na marcha 1!");
                }
            } else if (this.marcha == 2){
                if (this.velocidade < 40 ){
                    this.velocidade++;
                    System.out.println("Velocidade aplicada!");
                }else{
                    System.out.println("Velocidade máxima atingida na marcha 2!");
                }
            } else if (this.marcha == 3){
                if (this.velocidade < 60 ){
                    this.velocidade++;
                    System.out.println("Velocidade aplicada!");
                }else{
                    System.out.println("Velocidade máxima atingida na marcha 3!");
                }
            } else if (this.marcha == 4){
                if (this.velocidade < 80){
                    this.velocidade++;
                    System.out.println("Velocidade aplicada!");
                }else{
                    System.out.println("Velocidade máxima atingida na marcha 4!");
                }
            } else if (this.marcha == 5 ){
                if (this.velocidade < 100){
                    this.velocidade++;
                    System.out.println("Velocidade aplicada!");
                }else{
                    System.out.println("Velocidade máxima atingida na marcha 5!");
                }
            }else{
                if (this.velocidade < 120 && this.marcha == 6){
                    this.velocidade++;
                    System.out.println("Velocidade aplicada!");
                }else{
                    System.out.println("Velocidade máxima atingida na marcha 5!");
                }
            }
        }


    }

    public void Desacelerar(){

        if(!VerificaCarro()){
            System.out.println("Velocidade não aplicada!");
        } else {

            if (this.velocidade > 0) {
                this.velocidade--;
                System.out.println("Velocidade aplicada");
            } else {
                System.out.println("Velocidade mínima atingida!");
            }
        }

    }

    public void TrocarMarcha(int opcao){

        if (opcao == 1){
            if (this.marcha <= 1){
                if (this.velocidade > 0 && this.velocidade <= 20){
                    this.marcha++;
                    this.velocidade++;
                    System.out.println("Marcha Trocada!");
                } else{
                    System.out.println("Velocidade incorreta");
                }

            }
            else if (this.marcha < 2){
                if (this.velocidade > 21 && this.velocidade < 40){
                    this.marcha++;
                    this.velocidade++;
                    System.out.println("Marcha Trocada!");
                } else{
                    System.out.println("Velocidade incorreta");
                }

            } else if (this.marcha < 3){
                if (this.velocidade >= 41 && this.velocidade < 60){
                    this.marcha++;
                    this.velocidade++;
                    System.out.println("Marcha Trocada!");
                } else{
                    System.out.println("Velocidade incorreta");
                }

            } else if (this.marcha < 4){
                if (this.velocidade >= 61 && this.velocidade < 80){
                    this.marcha++;
                    this.velocidade++;
                    System.out.println("Marcha Trocada!");
                } else{
                    System.out.println("Velocidade incorreta");
                }

            } else if  (this.marcha < 5){
                if (this.velocidade >= 81 && this.velocidade < 100){
                    this.marcha++;
                    this.velocidade++;
                    System.out.println("Marcha Trocada!");
                } else{
                    System.out.println("Velocidade incorreta");
                }

            } else{
                if (this.velocidade >= 101 && this.velocidade < 120){
                    this.marcha++;
                    this.velocidade++;
                    System.out.println("Marcha Trocada!");
                } else{
                    System.out.println("Marcha máxima atingida!");
                }
            }



        } else{

            if(this.marcha == 6){
                if (this.velocidade >= 102){
                    System.out.println("reduza a velocidade para 101km/h para diminuir a marcha!");
                }else{
                    this.velocidade--;
                    this.marcha--;
                }
            } else if (this.marcha == 5){
                if (this.velocidade >= 82){
                    System.out.println("reduza a velocidade para 81km/h para diminuir a marcha!");
                }else{
                    this.velocidade--;
                    this.marcha--;
                }
            }else if (this.marcha == 4){
                if (this.velocidade >= 62){
                    System.out.println("reduza a velocidade para 61km/h para diminuir a marcha!");
                }else{
                    this.velocidade--;
                    this.marcha--;
                }
            }else if (this.marcha == 3){
                if (this.velocidade >= 42){
                    System.out.println("reduza a velocidade para 4km/h para diminuir a marcha!");
                }else{
                    this.velocidade--;
                    this.marcha--;
                }
            }else if (this.marcha == 2){
                if (this.velocidade >= 22){
                    System.out.println("reduza a velocidade para 21km/h para diminuir a marcha!");
                }else{
                    this.velocidade--;
                    this.marcha--;
                }
            } else{
                if (this.marcha == 1) {
                    System.out.println("Marcha mínima, não é possível reduzir!");
                    return;
                }
                //System.out.println("marcha:" + this.marcha);
                //System.out.println("velcidade: " + this.velocidade );


            }




        }

    }

    public void Direcionar(int opcao){

        if (this.velocidade > 0 && this.velocidade <= 40){
            if (opcao == 1 ) {
                System.out.println("Direcionado para a Esquerda!");
            }else{
                System.out.println("Direcionado para a Direita");
            }
        }else{
            if (this.velocidade == 0 ){
                System.out.println("Carro parado!");
            }else{
                System.out.println("Velocidade maior qu 40km/h");
            }
        }
    }

}



