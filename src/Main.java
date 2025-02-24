public class Main {
    public static void main(String[] args) {
        // Criando um objeto do iPhone
        iPhone iphone = new iPhone();
        
        // Testando as funcionalidades de Reprodutor Musical
        iphone.selecionarMusica("Shape of You");
        iphone.tocar();
        iphone.pausar();
        
        // Testando as funcionalidades de Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        // Testando as funcionalidades de Navegador na Internet
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
