package qaMetodosPadrao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IniciaWebDrive {
	
	/* Esta é a Classe "IniciaWebDrive". Ela é responsável por iniciar o driver do browser para navegação nas tela.
	 * Por se tratar de um recurso que todos os projetos necessitam, esta classe foi criada separadamente para poder 
	 * ser incorporada em qualquer outro projeto, afim de, normalizar e reaprveitar este recurso.  
	 */

	public static WebDriver driver;
	public WebDriver OpenDriver(String Browser)
	{
		switch (Browser.toUpperCase()) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "C:\\ProcessoPagNet_BluPagamentos\\ProjetoAvaliacaoBluPagamentos\\ProjetoBluPagamentos_RodrigoSantos\\Bibliotecas\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		
		default:
			break;
		}
		driver.manage().window().maximize();		
		return driver;
	}
	
	public void CloseDriver()
	{
		try 
		{ 
			driver.close();
			System.exit(0);
		} catch (Exception e) {}
	}
}
