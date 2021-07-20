package automacao;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ClientePage extends ClienteAttributes {

	public ClientePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void informarIdentificacaoPF() {
		fisica.click();
		cpf_cnpj.sendKeys("837.623.723-30");
		nome_razaosocial.sendKeys("Automacao");
		email.sendKeys("automacao@email.com");
		data_nascimento.sendKeys("20/07/2000");

		Select cmbSexo = new Select(sexo);
		cmbSexo.selectByVisibleText("Feminino");

		Select cmbEstadoCivil = new Select(estado_civil);
		cmbEstadoCivil.selectByVisibleText("Solteiro");
	}

	public void clicarAvancar() {
		avancar.click();
	}

	public void informarEnderecos() {
		// Endereço Principal
		endp_cep.sendKeys("99130-529");
		endp_endereco.sendKeys("Rua da Automacao Principal");
		endp_numero.sendKeys("123");
		endp_complemento.sendKeys("Bloco A");
		endp_cidade.sendKeys("Santa Catarina");

		Select cmbEstadoEndPrincipal = new Select(endp_estado);
		cmbEstadoEndPrincipal.selectByVisibleText("SC");
		endp_telefone.sendKeys("51 3366-9854");
		endp_celular.sendKeys("54 99658-3974");

		// Endereço Cobrança
		endc_cep.sendKeys("99134-569");
		endc_endereco.sendKeys("Rua da Automacao Cobrança");
		endc_numero.sendKeys("111");
		endc_complemento.sendKeys("Portaria 1");
		endc_cidade.sendKeys("Curitiba");

		Select cmbEstadoEndCobranca = new Select(endc_estado);
		cmbEstadoEndCobranca.selectByVisibleText("PR");
		endc_telefone.sendKeys("51 3366-9854");
		endc_celular.sendKeys("54 99658-3974");

	}

	public void verificarMensagemSucesso() {
		// TODO Auto-generated method stub

	}

	public void clicarSalvar() {
		salvar.click();
	}

}
