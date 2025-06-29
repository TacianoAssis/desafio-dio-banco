import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void setConta(Conta conta){
        this.contas.add(conta);
    }

    public void imprimirContas(){
        for(Conta conta : this.contas){
            conta.imprimirExtrato();
        }
    }

    public void imprimirClientes(){
        for(Conta conta : this.contas){
            System.out.println(String.format("Nome do Cliente: %s", conta.getCliente().getNome()));
        }
    }

}
