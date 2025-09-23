// Implmenta operações bancárias
package proxy;
public interface ITransacao{

    // Método abstrato para transferência bancária
    public void transferir(double valor, Conta contaDestino);

}