package PooJava2.integradora2.exercicio2;

public class Pereciveis extends Produto {

    // Numero usado para calculo de desconto
    private final int NUMERO_USADO_DESCONTO = 5;
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (this.diasParaVencer < 4) {
            return super.calcular(quantidadeDeProdutos) / (NUMERO_USADO_DESCONTO - diasParaVencer);
        }
        return super.calcular(quantidadeDeProdutos);
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "diasParaVencer: " + diasParaVencer;
    }
}
