# 📌 Calculadora (Versão Console)

Este projeto é a **primeira versão** da calculadora, desenvolvida em **Java**, que funciona apenas no **terminal** utilizando `Scanner` para entrada de dados e `System.out.println` para saída.

---

## 📖 Funcionalidades

- Solicita dois valores numéricos do usuário.  
- Solicita a operação desejada (`+`, `-`, `*`, `/`).  
- Realiza o cálculo e exibe o resultado.  
- Trata exceções para entradas inválidas (ex: letras em vez de números).  
- Impede divisão por zero.  
- Permite realizar múltiplas operações até o usuário decidir sair.

---

## 🛠️ Estrutura do Código

O código principal está contido na classe:

- `Calculadora.java` → contém:
  - `main` → fluxo de execução do programa no console.  
  - `realizarCalculo` → método responsável pelas operações matemáticas.  
  - `verificarNovaOperacao` → método para perguntar ao usuário se deseja continuar.

---

## 🚀 Como Executar

1. Compile o arquivo Java:

```bash
javac Calculadora.java
Execute o programa:

bash
Copiar código
java Calculadora
📌 Tecnologias Utilizadas
Java 17+ (funciona em versões posteriores também)

Scanner para entrada de dados via console

📂 Estrutura do Projeto
bash
Copiar código
/calculadora-console
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
Este projeto é apenas a versão inicial.
A versão mais avançada, com interface gráfica em Swing, está disponível em outra branch do repositório.
