public class Cliente 
{
   private String nome, profissao, cpf;
   private static int total;
   public Cliente()
   {
      Cliente.total++;
   }
   public String getNome()
   {
      return this.nome;
   }
   public void setNome(String nome)
   {
      this.nome=nome;
   }

   public String getProfissao()
   {
      return this.profissao;
   }
   public void setProfissao(String profissao)
   {
      this.profissao=profissao;
   }

   public String getCpf()
   {
      return this.cpf;
   }
   public void setCpf(String cpf)
   {
      this.cpf=cpf;
   }
   public static int getTotal()
   {
     return Cliente.total; 
   }
}
