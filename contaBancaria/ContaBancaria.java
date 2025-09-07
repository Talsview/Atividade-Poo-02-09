public class ContaBancaria{
    String nome;
    double saldo;
    
    public ContaBancaria (String nome,double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    
    }
    
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito de dindin: " + valor + "Feito");
        }
        else{
            System.out.println("Falhou com sucesso");
        }
    }
    
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
        saldo =- valor;
        System.out.println("Saque: " + valor + "Realizado");
        }
        else{
            System.out.println("Falhou com sucesso");
        }
    }
    
    public void exibirSaldo(){
        System.out.println("Conta de: " + nome + " Saldo Atual de " + saldo);
    }
}