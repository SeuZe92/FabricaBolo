package fabricadebolos;

public abstract class BoloAbstrato {

    private String nome;
    private String tipo;
    private float preco;


    public void sobreoBolo() {
        System.out.println(getNome() + ": R$" + getPreco());
    }

    public abstract void receita();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
