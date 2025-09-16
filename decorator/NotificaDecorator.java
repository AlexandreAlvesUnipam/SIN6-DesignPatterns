public class NotificaDecorator implements INotifica{
    
    INotifica notificador; // Composição

    public NotificaDecorator(INotifica notificador){
        this.notificador = notificador;
    }

    // Delegação para o objeto decorador
    @Override
    public void envia(String msg){
        notificador.envia(msg);
    }

}
