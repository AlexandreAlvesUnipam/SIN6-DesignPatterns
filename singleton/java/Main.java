public class Main{
    
    public static void main(String[] args) {
        
        // Primeiro acesso ao banco
        DBConnection conexao = DBConnection.getInstance();
        System.err.println("Status da conexão: " + conexao.getStatusConn());

        // Segunda conexão em outra operação
        DBConnection outraConexao = DBConnection.getInstance();
        System.err.println("Status da conexão: " + outraConexao.getStatusConn());

        // Verificando se as variáveis apontam para o mesmo objeto
        if(conexao.equals(outraConexao)){
            System.err.println("Mesmo objeto");
        }

    }

}