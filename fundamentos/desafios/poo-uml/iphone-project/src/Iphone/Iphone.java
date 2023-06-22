import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void buscarMusica() {
        System.out.println("Procurando música");

    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Próxima música");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Música anterior");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Mostrando página");
    }

    @Override
    public void adicionarAba() {
        System.out.println("Criando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando página anterior");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando a página");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atentendo o celular");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligando a chamada");
    }

}
