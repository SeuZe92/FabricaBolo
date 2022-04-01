package fabricadebolos;

public class Choconinho extends BoloAbstrato {

    public Choconinho() {
        setNome("Bolo de Choconinho");
        setPreco(19.9F);
        setTipo("Com Ninho e Chocolate");
    }

    @Override
    public void receita() {
        System.out.println("Receita");
    }
}
