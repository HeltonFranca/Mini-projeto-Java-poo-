abstract class Livro {
    
    protected String titulo;
    protected String autor;
    protected String anoPublicacao;
    
    
    public Livro(String titulo, String autor, String anoPublicacao){
        
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    
    public abstract void mostrarDetalhes();
}