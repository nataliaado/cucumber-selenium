package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import automacao.attributes.ClienteAttributes;
import automacao.commons.TestRule;
import automacao.commons.Utils;

public class ClientePage extends ClienteAttributes {

	public ClientePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void informarIdentificacaoPF(String strNome, String strEmail, String strData_nascimento, String strSexo,
			String strEstado_civil) {
		fisica.click();
		cpf_cnpj.sendKeys(Utils.gerarDocumento("CPF"));
		nome_razaosocial.sendKeys(strNome);
		email.sendKeys(strEmail);
		data_nascimento.sendKeys(strData_nascimento);

		Select cmbSexo = new Select(sexo);
		cmbSexo.selectByVisibleText(strSexo);

		Select cmbEstadoCivil = new Select(estado_civil);
		cmbEstadoCivil.selectByVisibleText(strEstado_civil);
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

	public boolean verificarMensagemSucesso() {

		try {
			synchronized (TestRule.getDriver()) {
				TestRule.getDriver().wait(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String strMensagemExibida = mensagem.getText();
		System.out.println("Mensagem de texto exibida: " + strMensagemExibida);
		if (strMensagemExibida.contains("Cliente cadastrado com sucesso")) {
			return true;
		} else {
			return false;
		}

	}

	public void clicarSalvar() {
		salvar.click();
	}

}
