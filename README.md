# 📱 Projeto iPhone - UML e Implementação em Java 🚀

## ✨ Descrição do Projeto

Seja bem-vindo ao incrível mundo da modelagem e implementação do iPhone! Neste projeto, vamos explorar as funcionalidades do iPhone como **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**. Aqui você encontrará tudo o que precisa para entender o projeto e como implementá-lo.

## 🎵 Funcionalidades do Reprodutor Musical
- **`tocar()`**: Inicia a reprodução de música.
- **`pausar()`**: Pausa a reprodução de música.
- **`selecionarMusica(String musica)`**: Seleciona uma música específica para tocar.

## 📞 Funcionalidades do Aparelho Telefônico
- **`ligar(String numero)`**: Realiza uma chamada para o número especificado.
- **`atender()`**: Atende uma chamada recebida.
- **`iniciarCorreioVoz()`**: Inicia o correio de voz.

## 🌐 Funcionalidades do Navegador na Internet
- **`exibirPagina(String url)`**: Exibe a página da web no URL especificado.
- **`adicionarNovaAba()`**: Adiciona uma nova aba no navegador.
- **`atualizarPagina()`**: Atualiza a página atual no navegador.

## 📊 Diagrama UML

Confira o nosso diagrama UML que representa a estrutura do projeto:

![Diagrama UML](https://github.com/BrunoAmericano/Modelagem-Diagrama-o-Iphone/blob/main/Untitled%20diagram-2025-02-24-134108.png?raw=true)

## 🗂️ Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **`ReprodutorMusical.java`**: Interface para o reprodutor musical.
- **`AparelhoTelefonico.java`**: Interface para o aparelho telefônico.
- **`NavegadorInternet.java`**: Interface para o navegador na internet.
- **`iPhone.java`**: Classe que implementa todas as funcionalidades do iPhone.
- **`Main.java`**: Classe principal para testar as funcionalidades.

## 🚀 Instruções de Uso

### 🔧 Compilar os Arquivos

Para compilar os arquivos `.java`, use o seguinte comando no terminal:

```bash
javac Main.java iPhone.java ReprodutorMusical.java AparelhoTelefonico.java NavegadorInternet.java
```

### ▶️ Executar o Programa
Para executar o programa, use o seguinte comando no terminal:

```bash
java Main