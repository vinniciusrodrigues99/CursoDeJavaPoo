import java.util.Scanner;
public class Conta 
{
	private double saldo, saldoDestino, valor; //modificador de acesso
	private double agencia, numero;
	Cliente titular;
	private static int total;
	Scanner ler = new Scanner(System.in);
	{
	}
	public Conta()
	{
		Conta.total++; //atributo static
		
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
	public double getNumero() //os métodos getters são como qualquer outro método, porém são usados para obter um determinado valor e por isso são do tipo double, pois retornam um atributo da minha classe.
	{
		return this.numero;
	}
	public void setNumero(double novoNumero) //os métodos setters são usados para atribuir um valor a variável que eu passo como parâmetro no meu método, estes valores costumam ser meus atributos da classe. 
	{	
		this.numero = novoNumero;
	}
	public double getAgencia()
	{
		return this.agencia;
	}
	public void setAgencia(double novaAgencia)
	{
		this.agencia = novaAgencia;
	}
	public Cliente getTitular()
	{
		return this.titular;
	}
	public void setTitular(Cliente titular)
	{
		this.titular = titular;
	}
	public static int getTotal()
	{
		return Conta.total;
	}
}
		
