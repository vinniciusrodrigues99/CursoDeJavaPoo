public class TestaCliente 
{
    public static void main(String[] args) 
    {
       // System.out.println("Bem vindo ao Banco Santander");
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "461268226-40";
        paulo.profissao = "Desenvolvedor";
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.depositar();
        contaDoPaulo.titular = paulo;
        System.out.println("O titular da conta é: "+contaDoPaulo.titular.nome);
    }   
}
