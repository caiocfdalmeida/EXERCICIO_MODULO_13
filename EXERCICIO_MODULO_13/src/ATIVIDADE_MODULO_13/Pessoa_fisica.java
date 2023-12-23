package ATIVIDADE_MODULO_13;

//Subclasse PessoaFisica
class Pessoa_fisica extends Pessoa {
 private String cpf;

 public Pessoa_fisica(String nome, String endereco, String cpf) {
     super(nome, endereco);
     this.cpf = cpf;
 }

 // Implementação do método exibirDados para PessoaFisica
 @Override
 public void exibirDados() {
     System.out.println("Pessoa Física:");
     System.out.println("Nome: " + nome);
     System.out.println("Endereço: " + endereco);
     System.out.println("CPF: " + cpf);
 }
}