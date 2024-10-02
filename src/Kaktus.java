public class Kaktus extends Krukväxter {

    public Kaktus(String namn, double längd) {
        super(namn, längd);
    }

    @Override
    public double vattenBehov() {
        return 0.02;
    }

    @Override
    public Vätska vatten() {
        return Vätska.MINERALVATTEN;
    }
}
