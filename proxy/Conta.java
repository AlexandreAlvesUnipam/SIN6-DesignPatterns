package proxy;

public class Conta implements ITransacao{
    
    private double saldo;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void transferir(double valor, Conta contaDestino){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor de transferencia deve ser maior que 0.");
        }

        if(valor > this.saldo){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }

        this.saldo -= valor;
        contaDestino.saldo += valor;
    }

}

