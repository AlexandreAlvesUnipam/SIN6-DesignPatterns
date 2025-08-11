public class Oracle implements IDatabaseConn{
    
    @Override
    public int conectar(){
        System.out.println("Verificando string de conexão..");
        System.out.println("Conectando com oracle...");
        return 1;
    }

    @Override
    public int desconectar(){
        System.out.println("Desconectando do oracle");
        return 0;
    }

    @Override
    public int query(String sql){
        System.out.println("Executando query...");
        return 1;
    }

}
