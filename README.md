# Observações sobre "Primeiros passos com Spring MVC"

Este documento contém minhas observações e anotações pessoais feitas durante a leitura do livro *Primeiros passos com Spring MVC* de **Normandes Júnior**, publicado pela **AlgaWorks Softwares, Treinamento e Serviços Ltda.**. O conteúdo a seguir tem o propósito de servir apenas como registro de estudo, respeitando os direitos autorais e uso conforme descrito no livro.

---
## Capítulo 1: Introdução

### Objetivos

- Criar uma aplicação simples com Spring MVC, Spring Boot e Thymeleaf utilizando o Spring Tools Suite.

---

## Capítulo 2: O Spring

### Introdução

Spring é um conjunto de projetos que resolvem várias situações do cotidiano do programador.

Surgiu como uma alternativa ao *Java EE*, e seus criadores sempre se preocuparam para que ele fosse o mais simples e leve possível.

### Spring vs Java EE

Spring não é, propriamente dizendo, um concorrente do Java EE. Isso porque quando se usa Spring, usa-se também tecnologias que estão dentro do Java EE.

Existem tanto programadores que trabalham com os projetos do Spring quanto os que trabalham apenas com as especificações do Java EE, sem Spring.

Spring é independente de especificação, então novos projetos são lançados e testados muito rapidamente. Caso exista uma aceitação geral em um novo projeto do ecossistema Spring, ele terá apoio de uma grande massa de desenvolvedores.

### O Spring Boot

O Spring Boot é um dos projetos dentro do Spring e permite que o programador desenvolva aplicações Spring com pouco esforço, isto é, com o mínimo de configuração.

Basicamente, ele analisa o projeto e o configura automaticamente.

### O Spring MVC

É o framework que te ajuda no desenvolvimento de aplicações web robustas, flexíveis e com uma clara separação de responsabilidades nos papéis do tratamento da requisição.

### O Thymeleaf

O Thymeleaf é tão somente uma biblioteca que foi criada para facilitar a criação da camada de view, com uma forte integração com o Spring e boa alternativa ao JSP.

É como a linguagem de templates do Django. Você coloca código Java nos arquivos HTML disponibilizados pelo servidor.

### O Maven

O Maven é uma ferramenta que automatiza uma série de tarefas. Usaremos ela para gerenciar dependências.

### O Spring Tools Suite

É uma IDE baseada no Eclipse com vários plugins úteis para o trabalho com Spring.

---

# Capítulo 3: O projeto de gestão de convidados

### Funcionamento

- Aplicação simples para demonstrar como o Spring Boot, o Spring MVC e o Thymeleaf trabalham juntos
- Spring Tools Suite
- Maven

- Dados: nome de um convidado e quantos acompanhantes
- Frontend: campo para capturar nome do convidado e outro para capturar a quantidade de acompanhantes, além de um botão para cadastrar e uma tabela para mostrar os dados já cadastrados

> Cadastrar João, que levará dois acompanhates

