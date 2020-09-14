package qaCodigosTestes;

import org.openqa.selenium.By;

import qaMetodosPadrao.IniciaWebDrive;
import qaMetodosPadrao.MetodosPadrao_Geral;

public class Login extends IniciaWebDrive{

	/* Esta é a Classe "Login" do Projeto responsavel por conter todo codigo fonte que for 
	   utilizado nas telas do Login do site.
	   Nesta Classe vai conter todos os metodos e comandos(IF,Else e etc..) para o Logar e Verificar se 
	   o Login foi realizado com sucesso.
	*/	
	
	public void RealizarLogin(String email, String senha)
    {
        MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
        ger.GoToURL("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        ger.AguardarElementos(By.xpath("//*[@id='email']"));

        if (!email.equals(""))
        {
            driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
        }

        if (!senha.equals(""))
        {
            driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(senha);
        }

        ger.ClickPadrao(By.xpath("//*[@id='SubmitLogin']"));
    }
	
}
