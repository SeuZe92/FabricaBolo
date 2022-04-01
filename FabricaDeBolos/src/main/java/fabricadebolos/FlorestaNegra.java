package fabricadebolos;

public class FlorestaNegra extends BoloAbstrato {

    public FlorestaNegra() {
        setNome("Bolo de Floresta Negra");
        setPreco(29.9F);
        setTipo("Com Formigas");
    }

    @Override
    public void receita() {
        System.out.println("Receita");
    }
}
