#language: pt
#encoding: UTF-8
@Cadastro
Funcionalidade: Cadastrar usuario

  @CadastroValido
  Cenario: 
    Quando eu clicar em registrar
    E informar email "tblima@gmail.com"
    E infomar nome "Thiago"
    E informar senha "123"
    E confirmar senha "12345"
    E Crio com saldo
    E aperto em cadastrar
    Entao confirmo cadastro

  @CadastroInvalidoEmail
  Cenario: 
    Quando eu clicar em registrar
    E informar email ""
    E infomar nome "Thiago"
    E informar senha "123"
    E confirmar senha "123"
    Entao aperto em cadastrar

  @CadastroInvalidoNome
  Cenario: 
    Quando eu clicar em registrar
    E informar email "tblima26@gmail.com"
    E infomar nome ""
    E informar senha "123"
    E confirmar senha "123"
    E aperto em cadastrar
    Entao confirmo cadastro

  @CadastroInvalidoSenha
  Cenario: 
    Quando eu clicar em registrar
    E informar email "tblima26@gmail.com"
    E infomar nome "thiago"
    E informar senha ""
    E confirmar senha "123"
    Entao aperto em cadastrar

  @CadastroInvalidConfSenha
  Cenario: 
    Quando eu clicar em registrar
    E informar email "teste@gmail.com"
    E infomar nome "thiago"
    E informar senha "tblima26@gmail.com"
    E confirmar senha ""
    Entao aperto em cadastrar

  @CadastroInvalidConfSenha2
  Cenario: 
    Quando eu clicar em registrar
    E informar email "teste@gmail.com"
    E infomar nome "thiago"
    E informar senha "123"
    E confirmar senha "465"
    E aperto em cadastrar
    Entao confirmo cadastro
