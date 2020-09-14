package qaCodigosTestes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import qaMetodosPadrao.IniciaWebDrive;
import qaMetodosPadrao.MetodosPadrao_Geral;

public class Compras extends IniciaWebDrive {
	
	/* Esta é a Classe "Compras" do Projeto responsavel por conter todo codigo fonte que for 
	   utilizado nas telas, afim de,  realizar um COMPRA.
	   Nesta Classe vai conter todos os metodos e comandos(IF,Else e etc..) para Pesquisar Produtos, Selecionar produto,
	   Definir Fomar de pagamento e Verificar status da compra.
	*/	
	

	public void PesquisarProdutos(String NomeProduto) {
		
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
		ger.AguardarElementos(By.xpath("//*[@id='search_query_top']"));
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys(NomeProduto + Keys.ENTER);
	}
	
	
	public void SelecionarProdutos() {
	
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
		ger.AguardarElementos(By.cssSelector(".right-block .product-name"));
		ger.ClickPadrao(By.cssSelector(".right-block .product-name"));
		assertTrue(driver.findElement(By.xpath("//*[@id='quantity_wanted']")).isDisplayed());
	}
	
	
	public void EnviarParaCarrinho(String Quantity, String Size	) {
		
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
		ger.AguardarElementos(By.xpath("//*[@id='quantity_wanted']"));
		
		if (!Quantity.contentEquals(""))
		{
			driver.findElement(By.xpath("//*[@id='quantity_wanted']")).clear();
			driver.findElement(By.xpath("//*[@id='quantity_wanted']")).sendKeys(Quantity);
		}
		
		if (!Size.contentEquals(""))
		{
			driver.findElement(By.xpath("//*[@id='group_1']")).sendKeys(Size);
		}
		
		ger.ClickPadrao(By.xpath("//*[@id='add_to_cart']/button"));
		
		/* Tela: Product successfully added.... */
		ger.AguardarElementos(By.xpath("//*[@id='quantity_wanted']"));
		ger.ClickPadrao(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
		
		/* Tela: SHOPPING-CART SUMMARY.... */
		ger.AguardarElementos(By.xpath("//*[@id='center_column']/p[2]/a[1]"));
		ger.ClickPadrao(By.xpath("//*[@id='center_column']/p[2]/a[1]"));
				
		/* Tela: ADDRESSES.... */
		ger.AguardarElementos(By.xpath("//*[@id='center_column']/form/p/button"));
		ger.ClickPadrao(By.xpath("//*[@id='center_column']/form/p/button"));
				
		/* Tela: SHIPPING.... */
		ger.AguardarElementos(By.xpath("//*[@id='form']/p/button"));
		driver.findElement(By.id("cgv")).click();
		ger.ClickPadrao(By.xpath("//*[@id='form']/p/button"));
		
	}
	
    public void MeiosPagamento(String TipoPagamento) {
		
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
		ger.AguardarElementos(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
				
		if (TipoPagamento.toUpperCase().contentEquals("BANK_WIRE")) {
			ger.ClickPadrao(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a"));
			
			ger.AguardarElementos(By.xpath("//*[@id='cart_navigation']/button"));
			ger.ClickPadrao(By.xpath("//*[@id='cart_navigation']/button"));
		}
		
		if (TipoPagamento.toUpperCase().contentEquals("CHECK")) {
			ger.ClickPadrao(By.xpath("//*[@id='HOOK_PAYMENT']/div[2]/div/p/a"));
			
			ger.AguardarElementos(By.xpath("//*[@id='cart_navigation']/button"));
			ger.ClickPadrao(By.xpath("//*[@id='cart_navigation']/button"));
		}
    }
		
	public void VerificarStatusCompra(String Status) {
		
		MetodosPadrao_Geral ger = new MetodosPadrao_Geral();
		ger.AguardarElementos(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
		ger.ClickPadrao(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
				
		/* Tela: MY ACCOUNT */
		ger.AguardarElementos(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a"));
		ger.ClickPadrao(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a"));
				
		/* Tela: ORDER HISTORY */
		ger.AguardarElementos(By.xpath("//*[@id='order-list']/tbody/tr/td[5]"));
		assertEquals(ger.GetAttribute(By.xpath("//*[@id='order-list']/tbody/tr/td[5]"),"innerText").toUpperCase(),Status.toUpperCase());
	}
	
	
	
	
	
}
