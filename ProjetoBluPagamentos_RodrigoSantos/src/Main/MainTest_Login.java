package Main;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import qaMetodosPadrao.IniciaWebDrive;
import qaRoteiroTeste.Roteiros_Login;

class MainTest_Login {
		
	/* Esta Classe Junit foi criada para conter somente cenários de testes para realização de LOGIN.
	 *  Foram inseridos somente dois casos por conta do tempo disponivel para desenvolvimento deste
	 *  processos seletivo, porem, mais cenários poderiam ser inseridos como:
	 * - Tentar Logar o campo de Email vazio.
	 * - Tentar Logar um email invalido(sem @aaa.com) 
	 * - Tentar Logar sem informar senha.
	 * - Tentar Logar informando senha errada.
	 * - etc...
	 */
		
    static WebDriver driver;
	
	@Test
	void T1_Login_Com_Sucesso() {
		
		/* Teste para realizar um Login com sucesso  */
		
		IniciaWebDrive run = new IniciaWebDrive();
		driver = run.OpenDriver("CHROME");
		
		Roteiros_Login log = new Roteiros_Login();
		log.LoginComSucesso();
		
		run.CloseDriver();
	}
	
	@Test
	void T2_Login_Com_Email_Inexistente() {
		
		/* Teste para realizar um Login com Email inexistente. Aqui o teste 
		 * deverá "quebrar". O Erro esperado neste caso não foi tratado propositalmente
		 * para evidenciar que o teste pegará o erro.
		 * */
		
		IniciaWebDrive run = new IniciaWebDrive();
		driver = run.OpenDriver("CHROME");
		
		Roteiros_Login log = new Roteiros_Login();
		log.LoginComEmailInexistente();
		
		run.CloseDriver();
	}
		
}
