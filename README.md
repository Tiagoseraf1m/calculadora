# 📟 Calculadora (Versão Console)

Este projeto é a **primeira versão** da calculadora, implementada em **Java**, utilizando apenas entrada e saída no **terminal** com `Scanner` e `System.out.println`.  

---

## 🚀 Funcionalidades
- Operações suportadas:
  - ➕ Adição (+)  
  - ➖ Subtração (-)  
  - ✖️ Multiplicação (*)  
  - ➗ Divisão (/)  
- Tratamento de erros:
  - Evita divisão por zero.  
  - Valida entradas não numéricas.  
- Permite realizar várias operações em sequência até o usuário decidir sair.  

---

## 💻 Exemplo de uso

```text
Digite o valor um:
10
Digite a operação (+, -, /, *):
+
Digite o valor dois:
5
Resultado: 15.0

Deseja realizar uma nova operação (Sim ou Não):
Sim

---

🛠️ Estrutura do Código
main → controla o fluxo principal, lê entradas do usuário e chama os métodos auxiliares.

realizarCalculo → executa a operação matemática escolhida.

verificarNovaOperacao → pergunta se o usuário deseja continuar.

---

▶️ Como executar
1. Compile o programa:

bash
Copiar código
javac Calculadora.java

2. Execute:

bash
Copiar código
java Calculadora
