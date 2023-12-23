package ATIVIDADE_MODULO_13;

//Subclasse PessoaJuridica
class Pessoa_juridica extends Pessoa {
 private String cnpj;

 public Pessoa_juridica(String nome, String endereco, String cnpj) {
     super(nome, endereco);
     this.cnpj = cnpj;
 }

 // Implementação do método exibirDados para PessoaJuridica
 @Override
 public void exibirDados() {
     System.out.println("Pessoa Jurídica:");
     System.out.println("Nome: " + nome);
     System.out.println("Endereço: " + endereco);
     System.out.println("CNPJ: " + cnpj);
 }
}