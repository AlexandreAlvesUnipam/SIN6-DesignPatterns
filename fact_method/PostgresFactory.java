public class PostgresFactory extends DatabaseConnFactory{

    @Override
    public IDatabaseConn criaObjDb() {
        return new Postgres();
    } 

}
