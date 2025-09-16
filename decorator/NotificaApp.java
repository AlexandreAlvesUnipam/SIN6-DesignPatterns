public class NotificaApp implements INotifica{

    @Override
    public void envia(String msg){
        System.out.println("Enviando notificação via Slack: "+msg);
    }
}