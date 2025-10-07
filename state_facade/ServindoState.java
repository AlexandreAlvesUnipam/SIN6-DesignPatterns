package state_facade;

// Estado que representa a última etapa da máquina. Servindo/serviu o café.
public class ServindoState implements ICafeState{
    
    private MaquinaCafe maquinaCafe;

    public ServindoState(MaquinaCafe maquinaCafe){
        this.maquinaCafe = maquinaCafe;
    }

    @Override
    public void insereMoeda(){
        System.out.println("Sirva primeiro e depois insira outra moeda");
    }

    @Override
    public void escolheCafe(){
        System.out.println("Retire o café da máquina");
    }
    
    @Override
    public void serveCafe(){
        System.out.println("Café já servido. Máquina pronta para nova operação");
        this.maquinaCafe.setEstado(new DisponivelState(this.maquinaCafe));
    }
}