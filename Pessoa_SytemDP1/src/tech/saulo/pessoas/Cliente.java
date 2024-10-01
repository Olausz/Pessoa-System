package tech.saulo.pessoas;

import tech.saulo.composicao.Profissao;
import java.util.Scanner;
public class Cliente extends Pessoa{
    private String codigo;
    private Profissao profissao;
    private String tipoProfissaoOutros;
    private Scanner sc = new Scanner(System.in);

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public void cadastrar() {
        super.cadastrar();
        System.out.println("Informe o codigo do cliente: ");
        this.codigo = sc.nextLine();
        System.out.println("Informe a profissão do cliente: ");
        Profissao profissao1 = Profissao.valueOf(sc.nextLine());
        if(profissao1 == Profissao.OUTROS){
            System.out.println(("Infome sua profissão: "));
            this.tipoProfissaoOutros = sc.nextLine();
        }
    }

    public String toString() {
        return "Cliente{" +
                "codigo='" + codigo + '\''+
                ", profissao=" + profissao +
                ", tipoProfissaoOutros='" + tipoProfissaoOutros + '\'' +
                "} ";
    }

}

