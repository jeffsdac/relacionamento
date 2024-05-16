# Projeto Relacionamentos
Esse é um projeto de estudos, o intuito desse repositório é mostrar e salvar algum conceito que já foi feito e estudado por mim, o desse repositório em especifico é para falar sobre relacionamento feitos em SpringBoot, e como implmentálos

## Ideia geral:
![diagrama](https://media.discordapp.net/attachments/771112650523541524/1240651790148436008/diagrama-entidade-relacionamento.png?ex=66475684&is=66460504&hm=a224ff8aa28d6823f95455feec0213ffa9b7a932e4087a9c899313a6cc1b0f38&=&format=webp&quality=lossless)

A ideia era construir essas classes através de ORM do SpringBoot (Hibernate) mapear e conseguir utilizar dos métodos da classe repository sem maiores problemas.

## Como instalar? 

Esse repositório é para estudos, então não recomendo que uma pessoa não técnica tente fazer sua instalação.
Se mesmo assim você quiser continuar, aqui vai como instalar 
### Pré-requisitos
- Ter uma IDE que consiga rodar springBoot sem problemas
- Ter a versão do JDK 17: [BAIXE AQUI](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## Passo a passo
- Clone o repositório em um dos seus diretórios locais
- Configure, nas pasta resources, suas Strings de conexão, por padrão o projeto vem com o Drive para o SGBD Postgresql, caso você queira utilizar em outro DB, terá de colocar o novo drive na pom.xml e depois mudar as strings de conexão
- Execute o arquivo RelationshipApplication.java
