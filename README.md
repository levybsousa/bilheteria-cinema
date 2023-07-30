
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
* Resquisição:

  Endpoint/filmes 

  Body:

  {


  "titulo" : "mario",

  "id" : 1

  }

### Exemplo de resposta do endpoint de save filme
* Resposta: 

Status 200k

{

"id": 1,

"titulo": "mario",

"genero": {

"id": 1,

"nome": null

},

"produtora" : {

"id": 1,

"nome": null

}

}

Status 500 Internal Server Error 

{
"timestamp": "2023-07-30T23:06:57.899+00:00",

"status": 500,

"error": "Internal Server Error",

"path": "/filmes"

}






