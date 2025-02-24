import iphone.iPhone; // Importando a classe do pacote correto

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.selecionarMusica("Shape of You");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
