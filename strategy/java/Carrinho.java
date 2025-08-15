// Context. Executa a implementação da estratégia. Interage com client
public class Carrinho {

    private IDesconto estategiaDesconto;

    public void setEstrategiaDesconto(IDesconto estrategia){
        this.estategiaDesconto = estrategia;
    }

    public double getPrecoFinal(double preco){
        return this.estategiaDesconto.aplicaDesconto(preco);
    }

}
