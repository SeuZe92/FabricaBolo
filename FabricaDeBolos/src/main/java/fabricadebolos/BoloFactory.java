package fabricadebolos;

public class BoloFactory implements Bolo {

    public enum Sabor {
        ABACAXI, FLORESTANEGRA, CHOCONINHO, PRESTIGIO;
    }

    @Override
    public BoloAbstrato getBolo(Sabor s) {
        BoloAbstrato b = null;

        switch (s) {

            case ABACAXI:
                b = new Abacaxi();
                break;
            case FLORESTANEGRA:
                b = new FlorestaNegra();
                break;
            case CHOCONINHO:
                b = new Choconinho();
                break;
            case PRESTIGIO:
                b = new Prestigio();
        }
        return b;
    }

}
