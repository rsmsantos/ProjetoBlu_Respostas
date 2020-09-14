package qaCodigosTestes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import qaMetodosPadrao.IniciaWebDrive;
import qaMetodosPadrao.MetodosPadrao_Geral;


public class Cadastro extends IniciaWebDrive{
	
	/* Esta é a Classe "Cadastro" do Projeto responsavel por conter todo codigo fonte que for 
	   utilizado nas telas do Criar Novo Cadastro.
	   Nesta Classe vai conter todos os metodos e comandos(IF,Else e etc..) para o Criar e Verificar se 
	   o Novo Cadastro foi realizado com sucesso.
	*/	

	public void CriandoConta_Email(String Email) {
		
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
        ger.GoToURL("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        ger.AguardarElementos(By.xpath("//*[@id='email_create']"));
        
        driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys(Email);
        driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
        
        ger.AguardarElementos(By.xpath("//*[@id='id_gender1']"));
	}
	
	public void CriandoConta_PersonalInformation(String title, String FristName, String LastName, String Password, 
			String Birth_day, String Birth_mouth, String Birth_years) {
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
		
		if (title.toUpperCase().contentEquals("MR."))
		{
			ger.ClickPadrao(By.xpath("//*[@id='id_gender1']"));
		}
		else {
			ger.ClickPadrao(By.xpath("//*[@id='id_gender2']"));
		}
		
		if (!FristName.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys(FristName);
		}
		
		if (!LastName.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys(LastName);
		}
				
		if (!Password.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(Password);
		}
		
		if (!Birth_day.contentEquals("") && !Birth_mouth.contentEquals("") && !Birth_years.contentEquals("") )
		{
			driver.findElement(By.xpath("//*[@id='days']")).sendKeys(Birth_day);
			driver.findElement(By.xpath("//*[@id='months']")).sendKeys(Birth_mouth);
			driver.findElement(By.xpath("//*[@id='years']")).sendKeys(Birth_years);
		}
	}
	
	public void CriandoConta_Address(String company, String address1, String address2, String city, String state, String postcode,
			String country, String other, String phone, String mobile, String alias) {
		
		if (!company.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='company']")).sendKeys(company);
		}
		
		if (!address1.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);
		}
		
		if (!address2.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(address2);
		}
		
		if (!city.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);
		}
		
		if (!state.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='id_state']")).sendKeys(state);
		}
		
		if (!postcode.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys(postcode);
		}

		if (!country.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='id_country']")).sendKeys(country);
		}
		
		if (!other.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='other']")).sendKeys(other);
		}
		
		if (!phone.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='phone']")).sendKeys(phone);
		}
				
		if (!mobile.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys(mobile);
		}
		
		if (!alias.contentEquals("")) {
			driver.findElement(By.xpath("//*[@id='alias']")).sendKeys(alias);
		}
	}
	
	public void CriandoConta_ConfirmaCadastro(String NomeClienteCadastrado) {
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
		ger.ClickPadrao(By.xpath("//*[@id='submitAccount']"));
		
		ger.AguardarElementos(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		assertEquals(ger.GetAttribute(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"),"text").toUpperCase(),
				     NomeClienteCadastrado.toUpperCase());
	}
	
}
