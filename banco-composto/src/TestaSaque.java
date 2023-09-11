
public class TestaSaque 
{
 public static void main(String[] args)
 {
    Conta conta = new Conta();
    conta.depositar();
    conta.sacar(conta.saldo,0);
    System.out.println("O seu saldo final é " +conta.saldo);
 }   
}
