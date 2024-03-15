
public class Main {
    public static void main(String[] args) {

        LivroFisico livroFisico = new LivroFisico("insanidade do programador java", "tico & teco", "2007", 5000);
        LivroDigital livroDigital = new LivroDigital("java para idiotas", "bolsonaro", "2015", "TXT", 59.9);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(livroDigital);

        biblioteca.listarLivros();
    }
}
