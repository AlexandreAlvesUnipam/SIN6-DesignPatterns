package observer;

// Sujeito

import java.util.ArrayList;

public class VirtualMachine {

    // Agregação com os assinantes - TEM UM
    private ArrayList<IObserver> assinantes = new ArrayList<>();
    private double memoryUsage;

    public void addObserver(IObserver observer){
        assinantes.add(observer);
    }

    public void removeObserver(IObserver observer){
        assinantes.remove(observer);
    }

    public void setMemoryUsage(double valor){
        this.memoryUsage = valor;
        this.notifyObservers();
    }

    private void notifyObservers(){
        for (IObserver assinante: assinantes){
            assinante.update(memoryUsage);
        }
    }
    
}