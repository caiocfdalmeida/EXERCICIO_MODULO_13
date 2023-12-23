package ATIVIDADE_MODULO_13;

	abstract class Pessoa {
	    protected String nome;
	    protected String endereco;

	    public Pessoa(String nome, String endereco) {
	        this.nome = nome;
	        this.endereco = endereco;
	    }

	    // Métodos abstratos que devem ser implementados nas subclasses
	    public abstract void exibirDados();
	}

