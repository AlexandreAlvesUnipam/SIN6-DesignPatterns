public class Postgres implements IDatabaseConn{

    @Override
    public int conectar(){
        System.out.println("Verificando string de conexão..");
        System.out.println("Autenticando...");
        System.out.println("Conectando com postgres...");
        return 1;
    }

    @Override
    public int desconectar(){
        System.out.println("Desconectando do postgres...");
        return 0;
    }

    @Override
    public int query(String sql){
        System.out.println("Executando query...");
        return 1;
    }
}
