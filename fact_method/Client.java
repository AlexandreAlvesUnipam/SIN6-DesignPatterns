import java.util.HashMap;

public class Client {
    public static void main(String[] args) {

        HashMap<String, DatabaseConnFactory> dbs = new HashMap<String, DatabaseConnFactory>();
        dbs.put("oracle", new OracleFactory());
        dbs.put("postgres", new PostgresFactory());

        int connStatus = dbs.get("oracle").connect();

        System.out.println("Status conexão: " + connStatus);

    }
}
