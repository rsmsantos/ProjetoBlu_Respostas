package qaRoteiroTeste;

import java.util.Random;
import qaCodigosTestes.Compras;

public class Roteiros_Compras {
	
	/* Esta é a classe "Roteiros_Compras" do Projeto responsavel por definir todos os caminhos que o testes
	   deverá passar para concluir as rotinas de COMPRAS, exibindo ponto a ponto cada etapa do teste.
	   Nesta Classe somente pode conter as chamadas dos metodos seguencialmente e não comandos como IF, Else e etc.
	*/

	public void RealizarCompraComSucesso() {
	
		/* Etapa 1: Cadastra Cliente e Loga No Site */
		
		String EmailRandomico = new Random().nextInt(1000) + "@testecompras.com";
		Roteiros_Cadastro cad = new Roteiros_Cadastro();
		cad.NovoCadastro(EmailRandomico);
		
		/* Etapa 2: Realiza a Compra */
		
		Compras com = new Compras();
		com.PesquisarProdutos("Blouse");
		com.SelecionarProdutos();
		com.EnviarParaCarrinho("2", "");
		com.MeiosPagamento("CHECK");
		com.VerificarStatusCompra("ON BACKORDER");
	}
	
	
    
}
