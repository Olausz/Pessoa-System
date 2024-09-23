package tech.saulo.pessoas;


import tech.saulo.composicao.Enderco;
import tech.saulo.composicao.Telefone;

public class Pessoa {
    private String nome;
    private String dataNascimento;

    public Enderco getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderco endereco) {
        this.endereco = endereco;
    }

    private Enderco endereco;
    private Telefone TelsContato;

    public void cadastrar() {

    }

    public String obterIdade(){
        return "";
    }
}
