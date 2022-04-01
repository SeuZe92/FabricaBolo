package fabricadebolos;

public class FabricaDeBolos {

    public static void main(String[] args) {

        BoloFactory bf = new BoloFactory();

        BoloAbstrato b1 = bf.getBolo(BoloFactory.Sabor.ABACAXI);
        b1.sobreoBolo();

        BoloAbstrato b2 = bf.getBolo(BoloFactory.Sabor.CHOCONINHO);
        b2.sobreoBolo();

        BoloAbstrato b3 = bf.getBolo(BoloFactory.Sabor.FLORESTANEGRA);
        b3.sobreoBolo();

        BoloAbstrato b4 = bf.getBolo(BoloFactory.Sabor.PRESTIGIO);
        b4.sobreoBolo();

        /*Abacaxi ab = new Abacaxi();
        ab.sobreoBolo();
        ab.receita();

        Choconinho ch = new Choconinho();
        ch.sobreoBolo();
        ch.receita();

        FlorestaNegra fn = new FlorestaNegra();
        fn.sobreoBolo();
        fn.receita();

        Prestigio pt = new Prestigio();
        pt.sobreoBolo();
        pt.receita();*/
    }
}
