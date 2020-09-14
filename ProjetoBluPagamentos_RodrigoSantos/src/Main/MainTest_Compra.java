package Main;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import qaMetodosPadrao.IniciaWebDrive;
import qaRoteiroTeste.Roteiros_Compras;

class MainTest_Compra {

	/* Esta Classe Junit foi criada para conter somente cenários de testes voltados para realização de uma COMPRA".
	 * Foi feito somente o caaso solicitado por conta do tempo disponivel para desenvolvimento deste processos seletivo, porem, 
	 * mais cenários poderiam ser inseridos como:
	 * - Realizar Compra com mais de uma forma de pagamento.
	 * - Realizar Compra com boletos. 
	 * - Tentar realizar uma compra com itens indisponiveis
	 * - Tentar realizar uma compra de um item com uma quantidade maiior que a do estoque.
	 * - etc...
	 */
		
	static WebDriver driver;
	 
	@Test
	void Realizar_Compra_Com_Sucesso() {
		
		/* Teste para realizar um Novo Cadastro com sucesso.
		 * 
		 *   Aqui neste teste ele fará:
		 *   - Uma cadastro do zero de um cliente.
		 *   - Uma busca e envio para o carrinho.
		 *   - Uma seleção de forma de pagamento
		 *   - Uma verificação do status da compra*/
		
		
		IniciaWebDrive run = new IniciaWebDrive();
		driver = run.OpenDriver("CHROME");
		
		Roteiros_Compras compra = new Roteiros_Compras();
		compra.RealizarCompraComSucesso();
	}

}
