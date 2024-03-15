class LivroFisico extends Livro {
    private int numPaginas;

    public LivroFisico(String titulo, String autor, String anoPublicacao, int numPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Livro Físico:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Número de Páginas: " + numPaginas);
    }
}
