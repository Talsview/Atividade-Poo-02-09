public class Filme {
    public String titulo;
    public String diretor;
    public int anoLancamento;
    public double duracao;

    public Filme(String titulo, String diretor, int anoLancamento, double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " horas");
    }

    public void verificarFilmeClassico() {
        int anoAtual = java.time.Year.now().getValue();
        if (anoAtual - anoLancamento > 30) {
            System.out.println(titulo + " é um clássico.");
        } else {
            System.out.println(titulo + " não é um clássico.");
        }
    }
}