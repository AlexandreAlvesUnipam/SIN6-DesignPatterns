package template_method;

public class VendedorRoupas extends ProcessaPedido{
    
    @Override
    public void validaEntrega(){
        System.out.println("Verificando disponibilidade da transportadora...");
        System.out.println("Calculando prazo de entrega...");
    }

    @Override
    public void validaPedido(){
        System.out.println("Verificando estoque da roupa...");
    }

}