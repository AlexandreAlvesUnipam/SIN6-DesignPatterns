package template_method;
// Classe que implementa processamento de pedido para vendedor

public abstract class ProcessaPedido {

    //TEMPLATE METHOD
    public void processaPedido(){
        this.login();
        this.validaPedido();
        this.confirmarPagamento();
        this.validaEntrega();
    }
 
    public abstract void validaEntrega();
    public abstract void validaPedido();

    public void login(){
        System.out.println("Efetuando login...");
    }

    public void confirmarPagamento(){
        System.out.println("Confirmando pagamento...");
    }

}