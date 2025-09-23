package proxy;

public class TransacaoProxy implements ITransacao{
    
    private ITransacao contaTransacao;

    public TransacaoProxy(Conta conta){
        this.contaTransacao = conta;
    }

    public void transferir(double valor, Conta contaDestino){

        System.out.println("Iniciando a transferência....");

        try{
            this.contaTransacao.transferir(valor, contaDestino);
            System.out.println("Tranferência concluída");
            System.out.println("Salvando em banco a transação bancária");
        } catch (Exception e){
            System.out.println("Falha identificada na operação: "+e.getMessage());
            System.out.println("Executando o rollback no banco!");
        }

    }

    
}

