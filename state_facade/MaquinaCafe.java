package state_facade;

public class MaquinaCafe {
    
    private ICafeState disponivel;
    private ICafeState servindo;
    private ICafeState preparando;
    private ICafeState estadoAtual;

    public MaquinaCafe(){
        disponivel = new DisponivelState(this);
        preparando = new PreparandoState(this);
        servindo = new ServindoState(this);
        this.estadoAtual = disponivel;
    }

    public void setEstado(ICafeState novoEstado){
        this.estadoAtual = novoEstado;
    }

    public ICafeState getDisponivel(){
        return disponivel;
    }

    public ICafeState getServindo(){
        return servindo;
    }

    public ICafeState getPreparando(){
        return preparando;
    }

    // DELEGA a execução da operação para o OBJETO QUE ESTÁ IMPLEMENTANDO O ESTADO
    public void insereMoeda(){
        this.estadoAtual.insereMoeda();
    }

    // DELEGA a execução da operação para o OBJETO QUE ESTÁ IMPLEMENTANDO O ESTADO
    public void escolheCafe(){
        this.estadoAtual.escolheCafe();
    }

    // DELEGA a execução da operação para o OBJETO QUE ESTÁ IMPLEMENTANDO O ESTADO
    public void serveCafe(){
        this.estadoAtual.serveCafe();
    }

}