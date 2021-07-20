#language: pt

@tag
Funcionalidade: Cadastro de Clientes

	Cenario: Inserir Cliente Pessoa Fisica
		Dado efetuei login no sistema
		E acessei o menu Clientes >> Inserir
		Quando na tela de Identificacao informo os dados de Pessoa Fisica
		E na tela de Identificacao clico em Avancar
		E na tela enderecos informo os enderecos
		E na tela enderecos clico em Salvar
		Entao na tela enderecos sera exibida mensagem de sucesso
		E efetuarei logout do sistema
