# Controle de Notas
CRUD feito com JSF, JPA, Hibernate e Primeface

Trata-se de uma aplicação web, para que o professor possa cadastrar seus alunos e assim acompanhar as notas de cada um.
Ao entrar na página, é mostrado uma tabela com os dados de todos os alunos, um formulário para pesquisa e outra para adicionar/editar.
Para cada aluno, deve ser informado o seu nome, sua série e a nota das 3 unidades. A média final é calculada pela aplicação.

## Itens cumpridos
Dado os itens pedidos no edital, além de usar JSF (A) e persistência (B) em um banco de dados (obrigatório), o projeto conta com o uso
do Hibernate e do JPA (C), para a persistência no banco de dados MySQL. Como parte visual, foi utilizado os componentes do Primefaces (G).
O projeto foi publicado no Heroku (J), mas devido a um erro ainda desconhecido por mim, não está sendo exibido a pág index.xhtml, porém,
o banco de dados está sendo armazenado a partir de lá, atráves do Add-on ClearDB.

## Para executar o projeto
O projeto foi desenvolvido usando a IDE Eclipse e o Tomcat v9.0, então basta adicionar o projeto nesse ambiente, e executar utilizando
esse server, que o mesmo já irá começar a funcionar.

## Possíveis erros
Caso o projeto apresente algum erro ao importar o projeto, deve-se ir na guia Project do Eclipse e rodar o comando Clean. 
Além disso, é necessário também esperar o eclipse carregar todas as dependdências.