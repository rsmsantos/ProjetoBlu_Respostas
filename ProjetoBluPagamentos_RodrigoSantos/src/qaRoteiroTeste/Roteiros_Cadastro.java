package qaRoteiroTeste;

import qaCodigosTestes.Cadastro;

public class Roteiros_Cadastro {
	
	/* Esta é a classe "Roteiros_Cadastro" do Projeto responsavel por definir todos os caminhos que o testes
	   deverá passar as rotinas de CADASTRO, exibindo ponto a ponto cada etapa do teste.
	   Nesta Classe somente pode conter as chamadas dos metodos seguencialmente e não comandos como IF, Else e etc.
	*/
	
	Cadastro novo = new Cadastro();
	
	public void NovoCadastro(String Email) {
		
		novo.CriandoConta_Email(Email);
		
		novo.CriandoConta_PersonalInformation("mr.",
				                              "Joao",
				                              "Silva",
				                              "123456",
				                              "11",
				                              "April",
				                              "1999");
		
		novo.CriandoConta_Address("Blu Pagamentos",
				                  "Rua A",
				                  "Bloco 2",
				                  "Rio de Janeiro",
				                  "Arizona",
				                  "85001",
				                  "United States",
				                  "",
				                  "21-35359595",
				                  "21-977778888",
				                  "");
		
		novo.CriandoConta_ConfirmaCadastro("Joao Silva");
		
	}
	
    public void CadastroSemDadosObrigatorios(String Email) {
		
		novo.CriandoConta_Email(Email);
		
		novo.CriandoConta_PersonalInformation("mr.",
				                              "",
				                              "",
				                              "123456",
				                              "11",
				                              "April",
				                              "1999");
		
		novo.CriandoConta_Address("Blu Pagamentos",
				                  "Rua A",
				                  "Bloco 2",
				                  "",
				                  "Arizona",
				                  "85001",
				                  "United States",
				                  "",
				                  "21-35359595",
				                  "21-977778888",
				                  "");
		
		novo.CriandoConta_ConfirmaCadastro("Joao Silva");
	 }
	
	
	

}
