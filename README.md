# Conversor de Moedas

Este projeto é um conversor de moedas desenvolvido em Java. O objetivo é fornecer uma ferramenta simples e eficiente para conversões de moedas, ajudando na análise do comportamento das taxas de câmbio.

---

## **Motivação**

A ideia surgiu para ajudar um amigo com um e-commerce de importação, permitindo uma análise mais detalhada do comportamento das moedas e auxiliando na tomada de decisões estratégicas. A ferramenta visa tornar o processo de conversão mais rápido e acessível.

---

## **Tecnologias Utilizadas**

### Backend:

- **Linguagem:** Java
- **API para taxas de câmbio:** ExchangeRate-API ([https://www.exchangerate-api.com/](https://www.exchangerate-api.com/))
- **Dependências:**
  - Jackson (para manipulação de JSON)

---

## **Funcionalidades do Projeto**

1. Conversão de moedas entre qualquer par suportado pela API.
2. Validação de entradas para garantir que os dados sejam válidos.
3. Histórico de conversões armazenado durante a execução da aplicação.

---

## **Estrutura do Projeto**

### **Classes Principais**

- ``: Classe responsável por integrar-se com a API externa e realizar o cálculo das conversões.
- ``: Classe para armazenar o histórico de conversões realizadas durante a execução da aplicação.

---

## **Como Rodar o Projeto**

### **Pré-requisitos**

1. **Java 8 ou superior**
2. **Maven** (para gerenciar as dependências do projeto)
3. Conexão com a internet (para acessar a API de taxas de câmbio)

### **Passos para executar**

1. Clone o repositório para sua máquina local:

   ```bash
   git clone https://github.com/seu-usuario/conversor-moedas.git
   ```

2. Navegue até a pasta do projeto:

   ```bash
   cd conversor-moedas
   ```

3. Compile e execute o projeto:

   ```bash
   mvn clean install
   java -jar target/conversor-moedas-1.0.jar
   ```

4. O programa será executado no terminal, onde você poderá inserir os dados para conversão.

---

## **Testando o Projeto**

Durante a execução, o programa solicitará os seguintes dados:

- Moeda de origem (ex.: USD).
- Moeda de destino (ex.: EUR).
- Valor a ser convertido (ex.: 100).

A aplicação retornará o valor convertido com base nas taxas mais recentes obtidas da API.

## **Autor**

Feito por [Igor Gabriel]([https://github.com/IgorGSBarbosaDev]). Se tiver dúvidas ou sugestões, fique à vontade para entrar em contato!

