package br.com.javabanco;

import java.util.Scanner;

public class TesteConta {


	public static void main(String[] args) {

		int numero = 0, agencia = 0, contador = 0;
		double saldo = 0, deposito = 0, saque = 0;
		String resposta1 = "", resposta2 = "";

		/**
		 * Números de conta e agência.
		 * Pré-definidos nestes valores, porém podem ser alterados livremente. 
		 */

		int num_conta = 123;
		int num_agencia = 911;
		

	try (Scanner sc = new Scanner(System.in)) {
		Conta cc = new Conta();
		
		numero = Conta.perguntaNum();
		agencia = Conta.perguntaAgc();
		
		/** Números de segurança da conta:
		 *  Se caso forem colocados corretamente permite o acesso às ações da conta,
		 *  se não, dá mais 3 chances ao usuário, e se persistir, bloqueia o acesso à conta. 
		 */
		
		while ((numero != num_conta || agencia != num_agencia) && contador < 3) {

			System.out.println("Numero ou agencia incorreta!\n");
			System.out.println("Resta " + (3 - contador) + " tentativas");

			numero = Conta.perguntaNum();
			agencia = Conta.perguntaAgc();
			
			contador++;
			
		}

		
		if (numero == num_conta && agencia == num_agencia) {  
		
			System.out.println("Digite o saldo da Conta:");
			saldo = sc.nextDouble();
			System.out.println("\n");
			
			cc.setNumero(numero);
			cc.setAgencia(agencia);
			cc.depositar(saldo);
			
			
			/** Ao acessar a conta, dá a opção ao usuário de fazer um depósito.
			 * Se sim, pede o valor dele, e adiciona no valor do saldo inicial,
			 * se não, prossegue para próxima ação.
			 */
			
			
			System.out.println("Deseja depositar algum valor? (S/N)");
			resposta1 = sc.next();
			if (resposta1.equalsIgnoreCase("S")) {
			
				System.out.println("Digite valor de deposito:");
				deposito = sc.nextDouble();
				cc.depositar(deposito);
				System.out.println("Saldo da conta: " + cc.getSaldo() + " reais\n");
				
			} 

				/**Se o usuário não queira fazer um depósito, ele dá a opção de fazer uma retirada.
				 * Se sim, pede o valor dela e subtrai do saldo inicial,
				 * Se não, o programa encerra e agradece.
				 */
				
				
					System.out.println("Deseja retirar algum valor? (S/N)");
					resposta2 = sc.next();
					if (resposta2.equalsIgnoreCase("S")) {
						
						System.out.println("Digite o valor a ser retirado");
						
						saque = sc.nextDouble();
						cc.retirar(saque);
						
						System.out.println("Saldo final: " + cc.getSaldo() + " reais\n");
						System.out.println("Obrigado, tenha um bom dia!");
					
			   } else {
				
				 System.out.println("Saldo final: " + cc.getSaldo() + " reais\n");
				 System.out.println("Obrigado, tenha um bom dia!");
			 }
		  
	    } else {
			System.out.println("Acesso negado, tente novamente mais tarde");
	  }
		
    }
	
  }
	
}
