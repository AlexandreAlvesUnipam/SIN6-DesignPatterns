public class DescontoNatalStrategy implements IDesconto{

    @Override
    public double aplicaDesconto(double preco) {
        return preco * 0.7;
    }

}
