package banco;

import java.util.Scanner;

import bancoException.BancoException;

public class ProgramaDoBanco {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero da conta:");
		int numero = sc.nextInt();
		System.out.println("Nome:");
		sc.nextLine(); 
		String nome = sc.nextLine(); 
		System.out.println("Saldo:");
		double saldo = sc.nextDouble();
		System.out.println("Limite de saque:");
		double limiteSaque = sc.nextDouble();
		
		DadosBanco banco = new DadosBanco(numero, nome, saldo, limiteSaque);
		System.out.println("\nInforme uma quantidade para sacar:");
		double saque = sc.nextDouble();
		
		try {
			banco.saque(saque);
			System.out.printf("Novo saldo: %.2f \n", banco.getSaldo());
		}
		catch(BancoException e ) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
