public class produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    public produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public boolean vender(int quantidadeVendida){
        if (quantidadeVendida <= this.quantidadeEmEstoque){
            this.quantidadeEmEstoque -= quantidadeVendida;
            System.out.println("Venda realizada!");
            return true;
        } else {
            System.out.println("Não deu bom: " + this.quantidadeEmEstoque);
            return false;
        }
    }

    public void reabastecer(int quantidade){
        quantidadeEmEstoque += quantidade;
        System.out.println("Produto reabastecido! " + quantidadeEmEstoque);
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}