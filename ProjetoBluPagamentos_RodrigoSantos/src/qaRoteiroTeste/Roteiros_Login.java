package qaRoteiroTeste;

import qaCodigosTestes.Login;
import qaCodigosTestes.Cadastro;

public class Roteiros_Login {
	
	/* Esta � a classe "Roteiros_Login" do Projeto responsavel por definir todos os caminhos que o testes
	   dever� passar para concluir as rotinas verifica��o do LOGIN, exibindo ponto a ponto cada etapa do teste.
	   Nesta Classe somente pode conter as chamadas dos metodos seguencialmente e n�o comandos como IF, Else e etc.
	*/	
	
	public void LoginComSucesso() {
		
		Login log = new Login();
		log.RealizarLogin("processo_pagnet@automatizado.com", "123456");
		
		Cadastro novo = new Cadastro();
		novo.CriandoConta_ConfirmaCadastro("Joao Silva");
	}
	
	
   public void LoginComEmailInexistente() {
		
		Login log = new Login();
		log.RealizarLogin("processo_xxxx_o@automatizado.com", "123456");
		
		Cadastro novo = new Cadastro();
		novo.CriandoConta_ConfirmaCadastro("Joao Silva");
	}
	
	

}
