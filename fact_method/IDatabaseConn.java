public interface IDatabaseConn{
    int conectar();
    int desconectar();
    int query(String sql);
}