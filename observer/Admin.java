package observer;

//Assinante
public class Admin implements IObserver{

    @Override
    public void update(double memoryUsage){
        if(memoryUsage > 50){
            System.out.println("Notificação para usuário admin! Memória ultrapassou 50%");
        }
    }
    
}
