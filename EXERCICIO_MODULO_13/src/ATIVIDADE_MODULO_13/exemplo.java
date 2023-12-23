package ATIVIDADE_MODULO_13;

public class exemplo {
    public static void main(String[] args) {
        Pessoa_fisica pessoa_fisica = new Pessoa_fisica("João", "Rua ABC, 123", "123.457.789-10");
        Pessoa_juridica pessoa_juridica = new Pessoa_juridica("Empresa XYZ", "Avenida BCA, 456", "12.345.678/0001-90");

        pessoa_fisica.exibirDados();
        System.out.println();
        pessoa_juridica.exibirDados();
    }
}