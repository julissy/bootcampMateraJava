package carteira;

import java.util.ArrayList;
import java.util.List;

public class Titular {

    private String nome;
    private String cpf;
    //private List <Contas> contas;

    public Titular(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        //contas = new ArrayList<>();

    }

    //public void mostrarContas() {
      //  for (Contas contas : conta ) {

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
