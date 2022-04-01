package fabricadebolos;

public class Prestigio extends BoloAbstrato {
    
    public Prestigio() {
        setNome("Bolo de Prestigio");
        setPreco(19.9F);
        setTipo("Com Prestigio");
    }
    
    @Override
    public void receita() {
        System.out.println("Receita");
    }
}
