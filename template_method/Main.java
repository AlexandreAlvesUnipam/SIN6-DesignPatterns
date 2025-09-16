package template_method;

public class Main {
    public static void main(String[] args) {
        
        ProcessaPedido pedidoRoupa = new VendedorRoupas();
        ProcessaPedido pedidoEletronico = new VendedorEletronicos();
        
        pedidoEletronico.processaPedido();        

    }
}