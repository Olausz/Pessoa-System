package tech.saulo.composicao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Enderco {
    private Scanner sc = new Scanner(System.in);
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String rua;
    private String numero;
    private String pais;
    private String cep;
    private String estado;
    private String cidade;

    public void cadastrar() {
        System.out.println("Informe rua: ");
        this.rua = sc.nextLine();
        System.out.println("informe numero:");
        System.out.println("Informe CEP: ");
        System.out.println("Informe Cidade: ");
        System.out.println("Infome Estado: ");
        System.out.println("Infome o Pais");
    }
}
