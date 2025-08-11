public class OracleFactory extends DatabaseConnFactory{

    @Override
    public IDatabaseConn criaObjDb() {
        return new Oracle();
    } 

}
