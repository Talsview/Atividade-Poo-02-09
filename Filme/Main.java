public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Um Monstro em Paris", "Bibo Bergeron", 2011, 1.3);
        filme.exibirDetalhes();
        filme.verificarFilmeClassico();
    }
}