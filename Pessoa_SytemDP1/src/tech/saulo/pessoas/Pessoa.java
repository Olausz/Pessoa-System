package tech.saulo.pessoas;

import java.util.Scanner;

import tech.saulo.composicao.Enderco;
import tech.saulo.composicao.Telefone;

public class Pessoa {

    private  Scanner sc = new Scanner(System.in);
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Enderco getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelsContato() {
        return TelsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        TelsContato = telsContato;
    }

    private String nome;
    private String dataNascimento;
    private Enderco endereco;
    private Telefone TelsContato;

    public void cadastrar() {
        System.out.println("Infome o nome: ");
        this.nome = sc.nextLine();
        System.out.println("Informe data de nascimento");
        this.dataNascimento = sc.nextLine();
        endereco = new Enderco();
        endereco.cadastrar();
    }

    public String obterIdade(){
        return "";
    }
}
