import java.util.Scanner;
public class Conta 
{
	protected double saldo, saldoDestino, valor; //modificador de acesso
	int agencia, numero;
	Cliente titular;
	Scanner ler = new Scanner(System.in);
	{
	System.out.println("Bem vindo ao banco Lucro Em Cima Da Mão De Obra Necessitada");
	}
	public boolean sacar(double saldo, double valor)
	{
		System.out.println("Digite o valor que deseja sacar");
		valor = ler.nextDouble();
		if(valor <= saldo){
		this.saldo = saldo - valor; //o this.saldo faz referência ao atributo enquanto o saldo é o parâmetro que será passado dentro do meu método quando ele for chamado. 
		//System.out.println("O saldo da sua conta é " +this.saldo);
		return true;
		}
		else
		{
			System.out.println("Você não possui saldo suficiente para este saque!");
			return false;
		}
	}
	public void depositar()
	{
		System.out.println("Digite o valor que deseja depositar:");
		valor = ler.nextDouble();
		this.saldo = saldo+valor;
		System.out.println("O saldo atual da sua conta é:" +this.saldo);
	}
	public boolean transfere(Conta destino)
	{
		System.out.println("Digite o valor que deseja transferir:");
		valor = ler.nextDouble();
		if(this.saldo>=valor)
		{
		this.saldo -= valor;
		System.out.println("Transferência realizada com sucesso");
		System.out.println("O seu saldo atual é " +this.saldo);
		destino.saldoDestino =valor;
		return true;
		}
		else
		return false;
	}
}
		
