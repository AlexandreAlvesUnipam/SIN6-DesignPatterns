package observer;

// Assinante
public class Users implements IObserver{

    @Override
    public void update(double memoryUsage) {
        if(memoryUsage > 85){
            System.out.println("Notificação para usuário admin! Memória ultrapassou 85%");
        }
    }
    
}
