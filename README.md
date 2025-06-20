# Projeto ContaBanco 🏦

Este projeto Java simula a criação de uma conta bancária através de uma aplicação de console interativa. Desenvolvido como parte de um desafio de sintaxe Java, ele demonstra conceitos fundamentais de entrada e saída de dados, manipulação de strings e validação de informações. 🚀

## Funcionalidades ✨

-   **Coleta de Dados Interativa:** Solicita ao usuário informações essenciais para a criação da conta, como número da conta, agência, nome do cliente e saldo inicial.
-   **Validação de Entrada Robusta:** Garante que os dados inseridos sigam formatos específicos:
    -   **Número da Conta:** Validação para o formato `XXXXX-X` (5 dígitos, hífen, 1 dígito).
    -   **Agência:** Validação para o formato `XXXX` (4 dígitos numéricos).
    -   **Saldo:** Aceita valores numéricos (com ponto ou vírgula como separador decimal) e verifica se o saldo não é negativo.
-   **Mensagem de Boas-Vindas Personalizada:** Após a coleta e validação dos dados, exibe uma mensagem de agradecimento e confirmação com todas as informações da nova conta.

## Como Executar o Projeto ▶️

Para compilar e executar este projeto, siga os passos abaixo:

1.  **Pré-requisitos:**
    -   Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina (versão 11 ou superior é recomendada).

2.  **Clone o Repositório (se ainda não o fez):**
    ```bash
    git clone https://github.com/FiddelRoseno/dio-trilha-java-basico.git
    ```

3.  **Navegue até o Diretório do Projeto:**
    ```bash
    cd dio-trilha-java-basico/ContaBanco/src/main/java/ContaTerminal
    ```

4.  **Compile o Código:**
    ```bash
    javac ContaTerminal.java
    ```

5.  **Execute a Aplicação:**
    ```bash
    java ContaTerminal
    ```

    O programa solicitará as informações da conta passo a passo no terminal.

## Tecnologias Utilizadas 💻

-   **Java**
-   **`java.util.Scanner`**: Para entrada de dados via console.
-   **`java.util.regex.Pattern`**: Para validação de formatos usando Expressões Regulares.
-   **`String.format`**: Para formatação da mensagem de saída.

## Autor 🧑‍💻

-   [Fiddel Roseno] (https://github.com/FiddelRoseno)

---


