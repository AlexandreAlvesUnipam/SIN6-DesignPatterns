package state_facade;

public class PreparandoState implements ICafeState {
    
    private MaquinaCafe maquinaCafe;

    public PreparandoState(MaquinaCafe maquinaCafe){
        this.maquinaCafe = maquinaCafe;
    }

    // Já inseriu a moeda
    @Override
    public void insereMoeda(){
        System.out.println("Moeda inserida. Preparando o café.");
    }

    @Override
    public void escolheCafe(){
        System.out.println("Café sendo preparado...");
        this.maquinaCafe.setEstado(new ServindoState(this.maquinaCafe));
    }

    // Precisa finalizar para servir
    @Override
    public void serveCafe(){
        System.out.println("Café ainda não foi preparado");
    }

}