class LivroDigital extends Livro {
    
    private String formatoArquivo;
    private double tamanhoArquivo;
    
    
    public LivroDigital(String titulo, String autor, String anoPublicacao, String formatoArquivo, double tamanhoArquivo){
        
        super(titulo, autor,anoPublicacao);
        this.formatoArquivo = formatoArquivo;
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    @Override
    
    public void mostrarDetalhes(){
        
        System.out.println("Livro digital :");
        System.out.println("título: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("ano de publicação :" + anoPublicacao);
        System.out.println("Tipo de arquivo: " + formatoArquivo);
        System.out.println("tamanho do arquivo : " + tamanhoArquivo);
    }

}