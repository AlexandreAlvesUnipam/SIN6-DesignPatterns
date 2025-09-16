public class SMSDecorator extends NotificaDecorator{
   
    public SMSDecorator(INotifica notificador){
        super(notificador);
    }

    public void notificaSMS(String msg){
        System.out.println("Notificando via SMS: "+ msg);
    }

    public void envia(String msg){
        super.envia(msg);
        notificaSMS(msg);
    }

}