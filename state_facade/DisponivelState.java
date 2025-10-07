package state_facade;

//Acabou de inserir a moeda
public class DisponivelState implements ICafeState{
    
    private MaquinaCafe maquinaCafe;

    public DisponivelState(MaquinaCafe maquinaCafe){
        this.maquinaCafe = maquinaCafe;
    }
    
    @Override
    public void insereMoeda(){
        System.out.println("Moeda já inserida. Selecione o café");
        this.maquinaCafe.setEstado(this.maquinaCafe.getPreparando());
    }

    @Override
    public void escolheCafe(){
        System.out.println("Aguarde confirmação do pagamento");
    }
    
    @Override
    public void serveCafe(){
        System.out.println("Café ainda não foi preparado");
    }
}

