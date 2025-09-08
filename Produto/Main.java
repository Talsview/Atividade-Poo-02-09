public class Main{
    public static void main(String[] args){
        produto oproduto = new produto("Davi", 50.0, 20);

        oproduto.exibirDetalhes();
        oproduto.vender(5);
        oproduto.reabastecer(10);
    }
}