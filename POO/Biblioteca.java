import java.util.ArrayList;

class Biblioteca implements BibliotecaAcoes {
    private ArrayList<Livro> livros = new ArrayList<>();

    @Override
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public void listarLivros() {
        System.out.println("Livros na Biblioteca:");
        for (Livro livro : livros) {
            livro.mostrarDetalhes();
            System.out.println();
        }
    }
}
