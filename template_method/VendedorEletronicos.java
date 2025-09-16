package template_method;

public class VendedorEletronicos extends ProcessaPedido{
    
    @Override
    public void validaEntrega(){
        System.out.println("Calculando prazo de entrega...");
    }

    @Override
    public void validaPedido(){
        System.out.println("Verificando estoque do eletrônico...");
    }

}