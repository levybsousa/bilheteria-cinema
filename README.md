
# BILHETERIA DE CINEMA 
### OBJETIVO

* Composta por cinco endpoints responsáveis por listar , 
salvar , alterar e deletar um filme específico com um determinado tipo de gênero e uma determinada produtora.

### TECNOLOGIAS UTILIZADAS:
* Java  versão 17
* Framework - Spring-boot versão 2.3.4
* SQL  - Imagem docker desenvolvimento local
*  para testes dos endpoints 

### Utilização da tecnologia no projeto:
* Desenvolvida totalmente em  Java na versão 17, 
com abordagem de programação orientada 
a objetos , empregando o  spring boot como framework 
na versão 2.3.4 . Foi utilizada uma imagem do  docker 
do postgresql   como banco para desenvolvimento local
e o Postman para realizar os testes dos endpoints.

### Exemplo de requisição  para o endpoint de save Filme.
* Através da classe controller do método POST o usuário 
poderá mandar um requisição através do método save( ) ,
que faz a chamada do método da classe FilmeService. Após isso o método 
faz a verificação se o filme passado pelo usuário consta
no banco de dados, se sim exibe uma mensagem reportando 
que o filme já encontra cadastrado se não ele salva o
novo filme 

### Exemplo de resposta do endpoint de save filme
* As respostas que pode ser obtida após rodar o programa são:

  Status: 200 ok ( filme salvado com sucesso )

  Status : 500 internal Server Error 


