public class Client {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        double precoOriginal = 100;

        carrinho.setEstrategiaDesconto(new DescontoNatalStrategy()); // Escolhe qual estratégia usar

        System.out.println("Desconto aplicado: " + carrinho.getPrecoFinal(precoOriginal));
    }
}
