public abstract class DatabaseConnFactory {
    
    public abstract IDatabaseConn criaObjDb();

    // Fábrica encapsula a lógica de criação/instanciação
    public int connect(){
        IDatabaseConn idb = criaObjDb();
        return idb.conectar();
    }

    public int consulta(String sql){
        IDatabaseConn idb = criaObjDb();
        return idb.query(sql);
    }

}
