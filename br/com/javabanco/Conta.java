package br.com.javabanco;

	/**@author Marcos Vinicius Pereira
	 * @version 1.0
	 * Programa em padrão Javabeans
	 */

import java.io.Serializable;
import java.util.*;

public class Conta implements Serializable {

	static Scanner sc = new Scanner(System.in);
	
	private static final long serialVersionUID = 1L;
	
	private int numero;
	private int agencia;
	private double saldo;


	//construtor padrao
	public Conta() { 
	
	}

	//construtor de classe
	public Conta(int numero, int agencia, double saldo) { 
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	//metodos 
	
		public void depositar(double valor) {  
			this.saldo += valor;
		}
		
		public void retirar(double valor) {
			this.saldo -= valor;
		}
		
		public double getSaldo() {
			return this.saldo;
		}

		public static int perguntaNum() {

			int numero;

			System.out.println("Digite numero da Conta:");
			numero = sc.nextInt();
			return numero;
		}

		public static int perguntaAgc(){

			int agencia;

			System.out.println("Digite numero da Conta:");
			agencia = sc.nextInt();
			return agencia;
		}
		
	//geters e seters
		
		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
}

