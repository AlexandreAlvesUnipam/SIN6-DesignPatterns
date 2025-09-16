public class Main {
    public static void main(String[] args) {
        
        NotificaApp notificador = new NotificaApp(); // Notificador padrão. Objeto que queremos decorar

        String mensagem = "Estagiário removeu a tabela no banco de produção";

        //notificador.envia(mensagem);

        // Decoradores concretos instanciados
        // Recebe no construtor qual objeto vai decorar
        INotifica notificadorEmail = new EmailDecorator(notificador);
        INotifica notificadorTeams = new TeamsDecorator(notificador);
        INotifica notificadorSMS = new SMSDecorator(notificador);

        // Objeto decorator
        // Recebe qual decorador concreto será utilizado
        NotificaDecorator notificaDecorator = new NotificaDecorator(notificadorSMS);
        notificaDecorator.envia(mensagem);
    }
}
