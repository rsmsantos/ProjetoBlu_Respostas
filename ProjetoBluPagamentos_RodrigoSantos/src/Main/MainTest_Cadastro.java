package Main;

import java.util.Random;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import qaMetodosPadrao.IniciaWebDrive;
import qaRoteiroTeste.Roteiros_Cadastro;

class MainTest_Cadastro {
	
	/* Esta Classe Junit foi criada para conter somente cenários de testes voltados para realização de um NOVO CADASTRO".
	 * Foram inseridos somente dois casos por conta do tempo disponivel para desenvolvimento deste processos seletivo, porem, 
	 * mais cenários poderiam ser inseridos como:
	 * - Tentar Cadastrar um email já utilizado.
	 * - Tentar Cadastrar um email invalido(sem @aaa.com) 
	 * - Tentar Cadastrar informando numeros nos campos de "Last Name" por exemplo.
	 * - etc...
	 */
	
    static WebDriver driver;
	
	@Test
	void T1_Criar_Novo_Cadastro() {
		
		/* Teste para realizar um Novo Cadastro com sucesso  */
		
		int EmailRandomico = new Random().nextInt(1000);
		
		IniciaWebDrive run = new IniciaWebDrive();
		driver = run.OpenDriver("CHROME");
		
		Roteiros_Cadastro cd = new Roteiros_Cadastro();
		cd.NovoCadastro(EmailRandomico+"@processoblupagamentos.com");
		
		run.CloseDriver();
	}	

	
	@Test
	void T2_Cadastro_Sem_Dados_Obrigatorios() {
		
		/* Teste para realizar um Novo Cadastro sem dados obrigatórios. Aqui o teste 
		 * deverá "quebrar". O Erro esperado neste caso não foi tratado propositalmente
		 * para evidenciar que o teste pegará o erro.
		 * */
		
		int EmailRandomico = new Random().nextInt(1000);
		
		IniciaWebDrive run = new IniciaWebDrive();
		driver = run.OpenDriver("CHROME");
		
		Roteiros_Cadastro cd = new Roteiros_Cadastro();
		cd.CadastroSemDadosObrigatorios(EmailRandomico+"@processoblupagamentos.com");
		
		run.CloseDriver();
	}	
	
	
}
