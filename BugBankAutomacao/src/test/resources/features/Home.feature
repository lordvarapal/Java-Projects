#language: pt
#encoding: UTF-8
Funcionalidade: Depois que logado

  Contexto: Ao abrir pagina de login
    Dado eu clicar em registrar
    E informar email "mario@gmail.com"
    E infomar nome "mario"
    E informar senha "123"
    E confirmar senha "123"
    E Crio com saldo
    E aperto em cadastrar
    E confirmo cadastro
    E eu informar o usuario "mario@gmail.com"
    E informar a senha "12345"
    E clicar no botao loguin
    Entao o sistema informa a mensagem "Olá mario,"

  @extrato
  Cenario: Apos logar ver extrato
    Quando acionar o botao do extrato
    E ver saldo disnponivel
    Entao clicar em voltar

  @Tranferencia
  Cenario: Apos logar realizar transferencia
    Quando clicar na tranferencia
    E informar o numero da conta "120"
    E informar o digiot da conta "2"
    E informar o valor da transferencia "200"
    E a descricao "TESTE"
    E clicar no botao transferir agora
    Entao o pagamento e realizado

  @Pagamento
  Cenario: Apos logar realizar pagamento
    Quando acionar o botao pagamentos
    E validar desenvolvimento
    Entao fechar a aba funcionalidade em desenvolvimento

  @Saque
  Cenario: Apos logar realizar saque
    Quando acionar o botao saque
    E validar desenvolvimento
    Entao fechar a aba funcionalidade em desenvolvimento
