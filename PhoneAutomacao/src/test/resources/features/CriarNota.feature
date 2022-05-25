#language: pt
#encoding: UTF-8

Funcionalidade: Google Keep

  Contexto:
  Dado que eu aciono o get started
  
  Cenario: Criar uma nota
  Quando acionar o botao de novo Note
  E informar no campo title "Nota 1"
	E informar no campo note "Teste de automacao"
	E acionar o botao voltar
	Entao o aplicativo cadastra a nota com o titulo "Nota 1"
	
  