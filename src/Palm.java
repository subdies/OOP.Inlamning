public class Palm extends Krukväxter {

    public Palm(String namn, double längd) {
        super(namn, längd);
    }

    @Override
    public double vattenBehov() {
        return 0.5 * längd;
    }

    @Override
    public Vätska vatten() {
        return Vätska.KRANVATTEN;
    }

}

