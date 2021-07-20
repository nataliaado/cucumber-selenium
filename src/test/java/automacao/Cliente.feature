#language: pt

@tag
Funcionalidade: Título da minha featue
	Usar esse template para minha feature

	Cenario: Inserir Cliente Pessoa Física
		Dado efetuei login no sistema
		E acessei o menu Clientes >> Inserir
		Quando na tela de Identificacao informo os dados de Pessoa Fisica
		E na tela de Identificacao clico em Avancar
		E na tela enderecos informo os enderecos
		E na tela enderecos clico em Salvar
		Entao na tela enderecos sera exibida mensagem de sucesso
		E efetuarei logout do sistema
