#language: pt
#encoding: UTF-8

Funcionalidade: Microsoft To Do

  Contexto: Que eu esteja logado
   
@loguin
  Cenario: Loguin
   Dado eu informar email "contrata_eu@outlook.com"
    E apertao botao sign in do email
    E informar a senha "meContr@t@"
    Entao apertao botao sign in da senha
    
	Cenario: Adicionar Lista
	Dado eu apertar em new list
	E informar o nome da lista "Teste"
	Entao Valida lista criada
	
	Cenario: Alterar lista
	Dado que eu entro na lista
	E aperto em cima de Teste
	E modifico o nome da lista para "Trocado"
	Entao entao salvo a lista
	
	
	Cenario: Adicionar item a lista
	Dado que eu entro na lista
	E que eu aperto em +
	E informo o item a adiconar a lista "item"
	E Aperto em salvar na lista 
	Entao o item esta salvo na lista 
	
	Cenario: Deletar item da lista
	Dado que eu entro na lista
	E encontrar o item
	E aperta nos ...
	E aperta em delete task
	Entao confirma delete task
	
	
	Cenario: Deletar lista
	Dado que eu entro na lista
	E aperta nos ...
	E aperta em delete list
	E confirma deletar a lista
	Entao valida o delete