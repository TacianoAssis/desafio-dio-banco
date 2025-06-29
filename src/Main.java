//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Cliente taciano = new Cliente();
        taciano.setNome("Taciano");
        Conta cc = new ContaCorrente(taciano);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(taciano);
        cc.transferir(cp,10);
        //cc.imprimirExtrato();
        //cp.imprimirExtrato();

        Banco banco = new Banco();
        banco.setNome("Meu Banco");
        banco.setConta(cc);
        banco.setConta(cp);
        banco.imprimirContas();
        banco.imprimirClientes();

    }
}