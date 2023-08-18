public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(); // Cria o objeto chamado c1 do tipo ContaCorrente.
        c1.Cadastrar(123,"Ana",789);
        c1.Depositar(1000);
        System.out.println("Saldo:" + c1.ConsultarSaldo() );
        c1.Sacar(200);
        System.out.println("Saldo:" + c1.ConsultarSaldo() );
    }
}