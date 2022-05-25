#language: pt
#encoding: UTF-8
@login
Funcionalidade: Criar Usuario

 
  Contexto: Ao abrir pagina de login
    Quando eu clicar em registrar
    E informar email "teste@gmail.com"
    E infomar nome "teste"
    E informar senha "12345"
    E confirmar senha "12345"

  @loginComSaldo
  Cenario: Login com saldo
    Quando Crio com saldo
    E aperto em cadastrar
    Entao confirmo cadastro
    Quando eu informar o usuario "teste@gmail.com"
    E informar a senha "12345"
    E clicar no botao loguin
    Entao o sistema informa a mensagem "Olá teste,"

  @loginSemSaldo
  Cenario: Login sem saldo
    Quando aperto em cadastrar
    Entao confirmo cadastro
    Quando eu informar o usuario "teste@gmail.com"
    E informar a senha "12345"
    E clicar no botao loguin
    Entao o sistema informa a mensagem "Olá teste,"

  @deslogar
  Cenario: logar e deslogar
    Quando aperto em cadastrar
    Entao confirmo cadastro
    Quando eu informar o usuario "teste@gmail.com"
    E informar a senha "12345"
    E clicar no botao loguin
    E o sistema informa a mensagem "Olá rafael,"
    Entao deslogar dos sistemas

  @loginInvalido
  Cenario: LoginInvalido
    Quando eu informar o usuario "asdf@gmail.com"
    E informar a senha "asdf"
    E clicar no botao loguin
    Entao o sistema informa a mensagem invalida"p"
