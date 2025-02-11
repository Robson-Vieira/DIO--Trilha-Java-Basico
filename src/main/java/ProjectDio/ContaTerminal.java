package ProjectDio;

import java.util.Scanner;

public class ContaTerminal {

	private int numero;
	private String agencia;
	private String nomeCliente;
	private double saldo; 
	
	public static void main(String[] args) throws Exception{
		ContaTerminal conta = new ContaTerminal();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome completo !");
		conta.nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o numero da conta !");
		conta.numero = scanner.nextInt();
		
		System.out.println("Por favor, digite o numero da agência !");
		conta.agencia = scanner.next();
		
		System.out.println("Por favor, digite o saldo da conta !");
		conta.saldo = scanner.nextDouble();
				
		System.out.println("Olá" + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia +", conta " + conta.numero +"e seu saldo " + conta.saldo +" já está disponível para saque");
	}
}
