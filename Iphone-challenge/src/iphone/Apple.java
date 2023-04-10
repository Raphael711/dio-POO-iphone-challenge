package iphone;

import iphone.ligacao.Telephone;
import iphone.musica.ReprodutorMusical;
import iphone.telefone.Telefone;

import java.sql.SQLOutput;

public class Apple {

    public static void main(String[] args) {
        Telefone iphone = new Telefone();
        System.out.println("REPRODUÇÃO DE MÚSICA.");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        System.out.println("-----------------------");
        System.out.println("NOVA PÁGINA.");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        System.out.println("-----------------------");
        System.out.println("FAZENDO UMA LIGAÇÃO.");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("------------------------");
        System.out.println("Finalizado funções básicas de um telefone, podendo ser aplicado em outros aparelhos.");
    }
}
