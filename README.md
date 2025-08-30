📌 Calculadora (Versão Console)

Este projeto é a primeira versão da calculadora, desenvolvida em Java, que funciona no terminal utilizando Scanner para entrada de dados e System.out.println para saída.

📖 Funcionalidades

Solicita dois valores numéricos do usuário

Solicita a operação desejada (+, -, *, /)

Realiza o cálculo e exibe o resultado

Trata exceções para entradas inválidas (ex: letras em vez de números)

Impede divisão por zero

Permite realizar múltiplas operações até o usuário decidir sair

🛠️ Estrutura do Código

O código principal está na classe Calculadora.java, que contém:

main → fluxo de execução do programa no console

realizarCalculo → responsável pelas operações matemáticas

verificarNovaOperacao → pergunta ao usuário se deseja continuar

🚀 Como Executar

Compile o arquivo Java:
javac Calculadora.java

Execute o programa:
java Calculadora

📌 Tecnologias Utilizadas

Java 17+ (compatível também com versões posteriores)

Scanner para entrada de dados via console

📂 Estrutura do Projeto

calculadora-console
├── Calculadora.java
└── README.md

▶️ Exemplo de Uso

Entrada:
Digite o valor um: 10
Digite a operação (+, -, /, *): +
Digite o valor dois: 5

Saída:
Resultado: 15.0
Deseja realizar uma nova operação (Sim ou Não): Não

✨ Observação

Este projeto é a versão inicial (console).
Uma versão mais avançada com interface gráfica em Swing está disponível em outra branch do repositório.
