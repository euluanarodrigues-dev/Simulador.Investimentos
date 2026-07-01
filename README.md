# Simulador de Carteira de Investimentos

Este projeto nasceu do desejo de organizar investimentos e entender o funcionamento de uma aplicação de gestão de ativos por baixo do capô. Ele funciona como um ambiente de testes pessoal onde utilizo Java, Spring Boot e AWS para simular uma gestão de ativos de forma segura e eficiente.

## Proposta do Projeto
O objetivo principal foi ir além de projetos básicos de estudo. O desafio aqui envolveu construir uma aplicação real, conectada a um banco de dados relacional na nuvem (AWS RDS), focando em boas práticas de desenvolvimento — como o uso de variáveis de ambiente para proteger dados sensíveis e acessos ao banco, evitando qualquer tipo de credencial exposta no código.

## Processo de Desenvolvimento e Uso de IA
Como o foco principal deste projeto era compreender a arquitetura e o ecossistema do framework Spring Boot, utilizei Inteligência Artificial de forma colaborativa durante o processo. A IA atuou como uma professora particular, guiando o passo a passo do desenvolvimento e gerando a estrutura do código sob minha orientação. Essa abordagem me permitiu focar no entendimento prático de conceitos complexos, como:
* Injeção de dependências e ciclo de vida do Spring Boot.
* Integração de microsserviços e aplicações locais com infraestrutura em nuvem.
* Gerenciamento e isolamento de credenciais sensíveis.

## Tecnologias Utilizadas
* Linguagem: Java 21
* Framework: Spring Boot
* Banco de Dados: PostgreSQL (hospedado na AWS RDS)
* Gerenciamento de Dependências: Maven
* Controle de Versão: Git e GitHub

## Aprendizados e Desafios
* Segurança e Configuração: Implementação de variáveis de ambiente para garantir que a aplicação rode de forma segura, mantendo as chaves de acesso ao banco isoladas do código público.
* Infraestrutura em Nuvem: O processo de provisionar e conectar um banco de dados na AWS trouxe uma visão prática sobre como aplicações locais se comunicam com serviços em nuvem.
* Estrutura de Repositório: Organização do projeto no formato Monorepo, separando claramente os arquivos de infraestrutura da AWS do código-fonte do backend, o que facilita a manutenção e escalabilidade.

## Próximos Passos
O projeto segue em desenvolvimento contínuo. Ao lado da minha mentoria com IA, as próximas melhorias planejadas são:

[ ] Implementar endpoints para cadastro e gestão de ativos.
[ ] Criar testes unitários para garantir a estabilidade do código.
[ ] Evoluir a arquitetura do sistema com foco em escalabilidade.

Fique à vontade para explorar o código, abrir issues ou enviar sugestões de melhoria.
