#language: pt

@tag
Funcionalidade: Cadastro de Clientes

	Esquema do Cenario: Inserir Cliente Pessoa Fisica
		Dado efetuei login no sistema utilizando o usuario john e a senha john
		E acessei o menu Clientes >> Inserir
		Quando na tela de Identificacao informo os dados de Pessoa Fisica: <nome>, <email>, <data_nascimento>, <sexo> e <estado_civil>
		E na tela de Identificacao clico em Avancar
		E na tela enderecos informo os enderecos
		E na tela enderecos clico em Salvar
		Entao na tela enderecos sera exibida mensagem de sucesso

		Exemplos:
			|	nome				|	email								|	data_nascimento	|	sexo			|	estado_civil	|
			| Automação		|	automacao@email.com	|	26/04/2000			|	Feminino	|	Solteiro			|