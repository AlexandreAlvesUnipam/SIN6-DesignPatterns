package proxy;

public class Main {
    public static void main(String[] args) {
        Conta contaA = new Conta(1000);
        Conta contaB = new Conta(500);

        // Classe "fachada" que vai implementar a lógica de chamar o proxy e retornar o resulta
        TransacaoProxy proxy = new TransacaoProxy(contaA);

        System.out.println("Saldo inicial da conta A: "+contaA.getSaldo());
        System.out.println("Saldo inicial da conta B: "+contaB.getSaldo());

        proxy.transferir(1500, contaB);
        System.out.println("Saldo inicial da conta A: "+contaA.getSaldo());
        System.out.println("Saldo inicial da conta B: "+contaB.getSaldo());

    }
}