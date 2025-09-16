public class TeamsDecorator extends NotificaDecorator{
    
    public TeamsDecorator(INotifica notificador){
        super(notificador);
    }

    public void notificaTeams(String msg){
        System.out.println("Notificando via Teams: "+msg);
    }

    public void envia(String msg){
        super.envia(msg);
        notificaTeams(msg);
    }
}