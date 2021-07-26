package automacao;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Utils {

	public static void logPrint(String strLog) {
		ExtentTest extentTest = TestRule.getExtentTest();
		try {
			efetuarPrintTela(strLog);
			extentTest.log(Status.INFO, strLog,
					MediaEntityBuilder
							.createScreenCaptureFromPath(
									System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLog + ".png")
							.build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void efetuarPrintTela(String strLog) {
		File scrFile = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLog + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void logPass(String strMensagem) {
		ExtentTest extentTest = TestRule.getExtentTest();
		extentTest.log(Status.PASS, strMensagem);
	}

	public static void logFail(String strMensagem) {
		ExtentTest extentTest = TestRule.getExtentTest();
		extentTest.log(Status.FAIL, strMensagem);
	}

	public static String gerarDocumento(String tipoDocumento) {
		switch (tipoDocumento) {
		case "CPF":
			return gerarCPF();
		case "CNPJ":
			return gerarCNPJ();
		default:
			return gerarCPF();
		}
	}

	public static String gerarCPF() {
		int[] n = new int[11];
		int d1;
		int d2;
		Random rnd = new Random();
		for (int i = 1; i < 10; i++) {
			n[i] = rnd.nextInt(10);
		}
		d1 = 0;
		for (int i = 1; i < 10; i++) {
			d1 = d1 + n[10 - i] * (1 + i);
		}
		d1 = (11 - (d1 % 11));
		d1 = (d1 >= 10) ? 0 : d1;
		d2 = d1 * 2;
		for (int i = 1; i < 10; i++) {
			d2 = d2 + n[10 - i] * (2 + i);
		}
		d2 = (11 - (d2 % 11));
		d2 = (d2 >= 10) ? 0 : d2;
		StringBuilder cpf = new StringBuilder();
		for (int i = 1; i < 10; i++) {
			cpf.append(n[i]);
		}
		cpf.append(d1);
		cpf.append(d2);
		return cpf.toString();
	}

	public static String gerarCNPJ() {
		int[] n = new int[13];
		int d1;
		int d2;
		Random rnd = new Random();
		for (int i = 1; i < 9; i++) {
			n[i] = rnd.nextInt(10);
		}
		n[9] = 0;
		n[10] = 0;
		n[11] = rnd.nextInt(10);
		n[12] = rnd.nextInt(10);
		d1 = 0;
		for (int i = 1; i < 9; i++) {
			d1 = d1 + n[13 - i] * (1 + i);
		}
		for (int i = 1; i < 5; i++) {
			d1 = d1 + n[5 - i] * (1 + i);
		}
		d1 = (11 - (d1 % 11));
		d1 = (d1 >= 10) ? 0 : d1;
		d2 = d1 * 2;
		for (int i = 1; i < 8; i++) {
			d2 = d2 + n[13 - i] * (2 + i);
		}
		for (int i = 1; i < 6; i++) {
			d2 = d2 + n[6 - i] * (1 + i);
		}
		d2 = (11 - (d2 % 11));
		d2 = (d2 >= 10) ? 0 : d2;
		StringBuilder cnpj = new StringBuilder();
		for (int i = 1; i < 13; i++) {
			cnpj.append(n[i]);
		}
		cnpj.append(d1);
		cnpj.append(d2);
		return cnpj.toString();
	}

	

}
