package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o numero da agencia:\n");
		int conta = scanner.nextInt();
		System.out.println("Insira a agencia:\n");
		String agencia = scanner.next();
		scanner.nextLine();
		System.out.println("Insira o nome do cliente:\n");
		String nomeCliente=scanner.nextLine();
		System.out.println("Insira o saldo da conta:\n");
		float saldo=scanner.nextFloat();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nomeCliente,agencia,conta,saldo);
		scanner.close();
	}
}
