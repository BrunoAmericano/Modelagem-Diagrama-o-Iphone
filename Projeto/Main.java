public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Teste do ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Five Finger Death punch");

        // Teste do AparelhoTelefonico
        meuIphone.ligar("31 1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Teste do NavegadorInternet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
