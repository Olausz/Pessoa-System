package tech.saulo.composicao;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Telefone {
    private int ddd;
    private String numero;
    private Scanner sc = new Scanner(System.in);


    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void cadastrar(){
        System.out.println("Informe o DDD: ");
        this.ddd = sc.nextInt();
        sc.nextLine();
        System.out.println("Infome o numero: ");
        this.numero = sc.nextLine();
    }
}
