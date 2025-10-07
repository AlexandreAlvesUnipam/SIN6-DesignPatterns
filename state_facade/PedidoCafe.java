package state_facade;

// Padrão Facade (Fachada)

public class PedidoCafe {
    
    // Encapsular a lógica das etapas para comprar o café

    public void runCafe(){
        // Expõe apenas esse método para o client
        MaquinaCafe maquina = new MaquinaCafe();
        maquina.insereMoeda();
        maquina.escolheCafe();
        maquina.serveCafe();
    }

}
