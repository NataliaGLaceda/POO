public class ContaCorrente {
    private long numero;
    private String nome;
    private int agencia;
    private double saldo;

    public void Cadastrar(long num,String nomePessoa, int ag){
        numero=num;
        nome=nomePessoa;
        agencia=ag;
        saldo=0;
    }

    public void Depositar(double valor){
        saldo += valor;
    }

    public void Sacar(double valor) {
        if (valor<=saldo)
            saldo -= valor;
        else
            System.out.println("Saldo insuficiente");
    }
    public double ConsultarSaldo(){
        return (saldo);
    }
}
