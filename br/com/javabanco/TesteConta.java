package br.com.javabanco;

import java.util.Scanner;

public class TesteConta {


	public static void main(String[] args) {

		int a = 0, b = 0;
		double c = 0, d = 0, e = 0;
		String f = "", g = "";
		
	try (Scanner sc = new Scanner(System.in)) {
		Conta cc = new Conta();
		
		System.out.println("Digite numero da Conta:");
		a = sc.nextInt();
		System.out.println("Digite agencia da Conta:");
		b = sc.nextInt();
		
		
		/** Números de segurança da conta:
		 *  Se caso forem colocados corretamente permite o acesso às ações da conta,
		 *  se não, bloqueia o acesso à conta. 
		 *  (Número, agência) = (123,911)
		 */
		
		
		if (a == 123 && b == 911) {  
		
			System.out.println("Digite o saldo da Conta:");
			c = sc.nextDouble();
			
			cc.setNumero(a);
			cc.setAgencia(b);
			cc.depositar(c);
			
			
			/** Ao acessar a conta, dá a opção ao usuário de fazer um depósito.
			 * Se sim, pede o valor dele, e adiciona no valor do saldo inicial,
			 * se não, prossegue para próxima ação.
			 */
			
			
			System.out.println("Deseja depositar algum valor? (S/N)");
			g = sc.next();
			if (g.equalsIgnoreCase("S")) {
			
				System.out.println("Digite valor de deposito:");
				d = sc.nextDouble();
				cc.depositar(d);
				System.out.println("Saldo final: " + cc.getSaldo() + " reais");
				
				System.out.println("Obrigado, tenha um bom dia!");
				
			} if (g.equalsIgnoreCase("N")) {
		
				
				/**Se o usuário não queira fazer um depósito, ele dá a opção de fazer uma retirada.
				 * Se sim, pede o valor dela e subtrai do saldo inicial,
				 * Se não, o programa encerra e agradece.
				 */
				
				
					System.out.println("Deseja retirar algum valor? (S/N)");
					f = sc.next();
					if (f.equalsIgnoreCase("S")) {
						
						System.out.println("Digite o valor a ser retirado");
						
						e = sc.nextDouble();
						cc.retirar(e);
						
						System.out.println("Saldo final: " + cc.getSaldo() + " reais");
						System.out.println("Obrigado, tenha um bom dia!");
					
			   } else if (f.equalsIgnoreCase("N")) {
				
				 System.out.println("Saldo final: " + cc.getSaldo());
				 System.out.println("Obrigado, tenha um bom dia!");
			 }
		  }
			
	    } else {
			System.out.println("Numero ou agencia incorreta");
	  }
    }
  }
}
