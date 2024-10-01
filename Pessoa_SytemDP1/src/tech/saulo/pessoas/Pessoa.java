package tech.saulo.pessoas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import tech.saulo.composicao.Enderco;
import tech.saulo.composicao.Telefone;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Enderco endereco;
    private Telefone TelsContato;

    private  Scanner sc = new Scanner(System.in);

    public void cadastrar() {
        System.out.println("Infome o nome: ");
        this.nome = sc.nextLine();
        System.out.println("Informe data de nascimento");
        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();
        System.out.println("Infome o mês: ");
        int mes = sc.nextInt();
        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();
        this.dataNascimento = LocalDate.of(ano, mes, dia);
        this.endereco = new Enderco();
        this.endereco.cadastrar();
        this.TelsContato = new Telefone();
        this.TelsContato.cadastrar();
    }

    public int obterIdade(){
        LocalDate dataNascimento = this.dataNascimento;
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataAtual);

        return periodo.getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Enderco getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderco endereco) {
        this.endereco = endereco;
    }
}
