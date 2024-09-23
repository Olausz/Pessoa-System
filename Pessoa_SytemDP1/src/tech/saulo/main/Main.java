package tech.saulo.main;

import java.util.Scanner;
import tech.saulo.pessoas.Pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        Scanner sc = new Scanner(System.in);
        String nome = "Saulo";

        pessoa1.getEndereco();
    }
}