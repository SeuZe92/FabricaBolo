package fabricadebolos;

public class Abacaxi extends BoloAbstrato {

    public Abacaxi() {
        setNome("Bolo de Abacaxi");
        setPreco(39.9F);
        setTipo("Com Abacaxi");
    }

    @Override
    public void receita() {
        System.out.println("Receita");
    }
}
