# 📈 Simulador de Carteira de Investimentos - XP Inc.

Este é um projeto prático desenvolvido em **Java** para simular as operações básicas de uma carteira de investimentos no ecossistema da **XP Inc.** O objetivo principal é consolidar fundamentos de Programação Orientada a Objetos (POO), estruturas de dados eficientes e simular regras de negócio do mercado financeiro.

---

## 🛠️ Tecnologias e Conceitos Aplicados

### 1. Java Moderno e POO
*   **Encapsulamento:** Utilização de modificadores de acesso (`private`) e métodos assessores (`getters/setters`) nas classes `Ativo` e `Investimento` para garantir a segurança e consistência dos dados dos ativos.
*   **Java Streams & Lambdas:** Implementação de funções funcionais para iterar e exibir os ativos do mercado de forma limpa e performática.

### 2. Estrutura de Dados & Performance
*   **Uso de HashMaps (`Map<String, Ativo>`):** Escolha estratégica da estrutura chave-valor para simular a busca de ativos pelo seu *Ticker* (ex: XPBR31). Isso garante uma busca com complexidade de tempo constante, simulando cenários reais de alta performance onde a latência precisa ser mínima.
*   **Lists (`ArrayList`):** Utilizado para gerenciar a carteira dinâmica de investimentos do cliente de forma sequencial.

---

## 🚀 Próximos Passos (Evolução Técnica & AWS)

Como parte do meu cronograma focado no ecossistema **Java + AWS**, o planejamento de evolução deste projeto inclui:

1.  **Persistência de Dados:** Substituir as listas na memória do programa por um banco de dados relacional (PostgreSQL) simulando o **AWS RDS** ou não-relacional usando o **Amazon DynamoDB**.
2.  **Arquitetura de Nuvem:** Transformar o simulador em uma API REST utilizando **Spring Boot** e realizar o deploy da aplicação utilizando containers (**Amazon ECS/EKS**) ou instâncias virtuais (**Amazon EC2**).
3.  **Mensageria:** Implementar eventos de compra e venda assíncronos simulando o uso de **AWS SQS / SNS** para garantir que ordens simultâneas não gerem gargalos no sistema.

---

## 💻 Como Rodar o Projeto

1. Certifique-se de ter o Java JDK instalado (Versão 8 ou superior).
2. Clone o repositório:
   ```bash
   git clone [https://github.com/euluanarodrigues-dev/SimuladorCarteiraXP.git](https://github.com/euluanarodrigues-dev/SimuladorCarteiraXP.git)