public class Köttätande extends Krukväxter {

    public Köttätande(String namn, double längd) {
        super(namn, längd);
    }

    @Override
    public double vattenBehov() {
        return 0.1 + (0.2 * längd);
    }

    @Override
    public Vätska vatten() {
        return Vätska.PROTEINDRYCK;
    }

}
