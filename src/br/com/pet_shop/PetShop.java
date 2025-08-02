package br.com.pet_shop;

public class PetShop {

    private boolean pet;
    private int shampoo;
    private int agua;
    private Boolean PetLimpo = false;
    private boolean limpo = true;

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void VerificarAgua(){
        System.out.println("Nível da água é: " + getAgua() + " Litros.");
    }

    public void VerificarShampoo(){
        System.out.println("Nível do shampoo é: " + getShampoo() + " Litros.");
    }

    public void AdicionaAgua(){
        if (this.agua < 30){
            if (this.agua == 29){
                this.agua++;
            }else{
                this.agua += 2;
            }
            System.out.println("Água adicionada a máquina!");
        } else {
            System.out.println("Capacidade máxima de água atingida!");
        }
    }

    public void AdicionaShampoo(){

        if (this.shampoo < 10){
            if (this.shampoo == 9){
                this.shampoo++;
            } else{
                this.shampoo +=2;
            }
            System.out.println("Adiciona Shampoo na máquina!");
        }else{
            System.out.println("Capacidade máxima de shampoo atingida!");
        }

    }

    public boolean isPet() {
        return pet;
    }

    public void AdicionarPet(){

        if (isPet()){
            System.out.println("Já existe um pet na máquina!");
        } else{
            if ( VerificarLimpeza()){
                System.out.println("Pet colocado na máquina!");
                this.pet = true;
            } else{
                System.out.println("Realizar limpeza da maquina!");
            }

        }

    }

    public void RemoverPet(){

        if (!isPet()){
            System.out.println("Não há pet na máquina!");
        } else{
            System.out.println("Pet removido da máquina!");
            this.PetLimpo = false;
            this.pet = false;
        }

    }

    public Boolean VerificarPet(){

        return this.pet;

    }

    public Boolean VerificarPetlimpo(){

        return this.PetLimpo;

    }

    public Boolean VerificarLimpeza(){

        return this.limpo;

    }

    public void RealizarBanho(){

        if (isPet()){
            if (!VerificarPetlimpo()){
                if (getAgua() >= 10 && getShampoo() >= 2 ){
                    System.out.println("Banho realizado");
                    this.PetLimpo = true;
                    this.shampoo -= 2;
                    this.agua -= 10;
                    this.limpo = false;

                } else{
                    if (getAgua() < 10){
                        System.out.println("Banho não realizado, incluir água!");
                    }else {
                        System.out.println("Banho não realizado, incluir Shampoo!");
                    }
                }
            }else{
                System.out.println("Pet já limpo!");
            }

        }else{
            System.out.println("Incluir um pet!");
        }

    }

    public void LimparMaquina(){

        if (getAgua() >= 3 && getShampoo() >= 1){
            System.out.println("Maquina limpa!");
            this.limpo = true;
        } else{
            if (getAgua() < 3){
                System.out.println("Inserir água na máquina!");
            } else{
                System.out.println("Inserir shampoo na máquina!");
            }
        }


    }

}
