package br.com.bank_account;

public class Account {

    private double saldo = 0;
    private double cheque_especial = 0;
    private double LIMITE_CHEQUE_ESPECIAL = 0;
    private double taxa = 0;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){ //consulta o saldo
        return this.saldo;
    }

    public void setChequeEspecial(){
        this.LIMITE_CHEQUE_ESPECIAL = saldo <= 500 ? 50 : saldo * 0.5;
        System.out.println("Limite: " + this.LIMITE_CHEQUE_ESPECIAL);
    }

    public double getLimiteChequeEspecial(){
        return this.LIMITE_CHEQUE_ESPECIAL;
    }

    public double getChequeEspecial(){ //consulta cheque especial
        return this.cheque_especial;
    }

    public boolean VerificaUsoChequeEsp(){ //verifica uso de cheque especial;

        if (this.cheque_especial < 0){
            return true;
        }
        return false;
    }

    public void DepositarSaldo(double saldo){ //depositar dinheiro
        this.saldo += saldo;
    }

    public boolean SacarDinheiro(double saldo){ //sacar dinheiro


        if (saldo <= this.saldo){
            this.saldo -= saldo;
            return true;
        } else{
            

            if (this.saldo + this.LIMITE_CHEQUE_ESPECIAL >= saldo && this.cheque_especial + saldo <= this.LIMITE_CHEQUE_ESPECIAL){
                this.saldo -= saldo;

                if (this.cheque_especial < 0  && (this.cheque_especial - (this.saldo * 1) ) <= this.LIMITE_CHEQUE_ESPECIAL ){

                    if ( this.cheque_especial + (saldo * -1) * 1 > this.LIMITE_CHEQUE_ESPECIAL){
                        return false;
                    }

                    this.cheque_especial = this.cheque_especial + (saldo * -1);
                    this.saldo = 0;
                    return true;
                }

                this.cheque_especial = this.saldo;
                this.saldo = 0;
                return true;
            }
        
        }


        return false;
    }


    public void AtualizaConta(){

        if (VerificaUsoChequeEsp()){
            this.taxa += (this.cheque_especial * -1) * 0.2;

        }
    }

}
