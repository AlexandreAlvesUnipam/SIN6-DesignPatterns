/*
 *Cria uma instância única de conexão com o Banco de Dados 
 */

public class DBConnection{

    private static DBConnection objConexao;
    private int statusConn = 0;

    private DBConnection(){ // Objetos dessa classe não podem ser instanciados. Apenas essa classe pode fazer essa operação
        System.err.println("Abrindo conexão com banco...");
        this.statusConn = 1;
    }

    public static DBConnection getInstance(){

        if (objConexao == null) {
            objConexao = new DBConnection();
        }

        return objConexao;

    }

    public int getStatusConn(){
        return this.statusConn;
    }

}