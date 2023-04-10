package iphone.telefone;

import iphone.internet.Navegador;
import iphone.ligacao.Telephone;
import iphone.musica.ReprodutorMusical;

public class Telefone implements ReprodutorMusical, Telephone, Navegador {
    @Override
    public void tocar() {
        System.out.println("Tocando a Música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a Música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando a Música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma Pagina.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendeu o Telefone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Caiu no correio de voz.");
    }
}
