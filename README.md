# desafio-elixir-stone
Programa de Formação em Elixir | Teste Técnico

Projeto criado utilizando o maven como gerenciador de dependências.
A versão ideal para rodar essa aplicação é java 8.

O desafio contém testes unitários da classe e de métodos.
A classe Utils do pacote utils, contém algumas itens para realização de dos testes.

Optei por dividir as funcionalidades na classe main em vários métodos para que seja de fácil compreensão e refatoração.

O código deve ser rodado pela classe App que contém o método main.

rode esses comando a partir da raiz do projeto.

com esse comando é possível compilar o código: 
  javac src/main/java/desafio/App.java src/main/java/desafio/Challenge.java src/main/java/desafio/Item.java src/main/java/utils/Utils.java -d target/classes
com o comando abaixo é possível rodar o código: 
  java -Dfile.encoding=UTF-8 -cp target/classes desafio.App