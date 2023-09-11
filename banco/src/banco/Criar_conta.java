package banco;

public class Criar_conta {
	public static void main(String[]args) 
	{
		/* Conta conta1 = new Conta();
		conta1.saldo = 200;
		conta1.saldo +=50;
		System.out.println(conta1.saldo);
		Conta conta2 = conta1;
		//Conta conta2 = new Conta();
		//conta2.saldo = 300;
		System.out.println(conta2.saldo);
		conta2.saldo += 100;
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo); */ 
		Conta contadojunior = new Conta();
		contadojunior.sacar(100, 0, 123, null, 0);
		//System.out.println("O saldo da sua conta é "+contadojunior.saldo);
		contadojunior.depositar(100);
		//System.out.println("O saldo da conta do junior é"+ contadojunior.saldo);
		Conta contaDaJulia = new Conta();
		contadojunior.transfere(contaDaJulia);
		System.out.println("O saldo da conta da Julia é: " +contaDaJulia.saldoDestino);
	}
}
