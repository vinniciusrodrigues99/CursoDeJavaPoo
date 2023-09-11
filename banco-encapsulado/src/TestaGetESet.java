public class TestaGetESet
{
    
    public static void main(String[] args) 
    {
        Conta conta = new Conta();
        Cliente sergio = new Cliente();
        sergio.setNome("Sergio");
        conta.setTitular(sergio);
        System.out.println("O nome do titular é: " +conta.getTitular().getNome());
        conta.setNumero(2000);
        System.out.println("O número da conta é " +conta.getNumero());
        conta.setAgencia(10503);
        System.out.println("O número da agência é: "+conta.getAgencia());
        System.out.println("");
        Conta conta2 = new Conta();
        Cliente ana = new Cliente();
        ana.setNome("ana");
        conta2.setTitular(ana);
        System.out.println("O nome do titular é: " +conta2.getTitular().getNome());
        conta2.setNumero(31583);
        System.out.println("O número da conta é: " +conta2.getNumero());
        conta2.setAgencia(201);
        System.out.println("O número da agência é: " +conta.getAgencia());
        System.out.println("");
        System.out.println("O número de contas criadas foram: " +Conta.getTotal() + " contas");
        System.out.println("O número de pessoas físicas cadastradas foram: " +Cliente.getTotal()+" pessoas físicas");
    }
}