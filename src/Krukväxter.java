public abstract class Krukväxter implements Interface {
    // VARIABLER SOM KOMMER ATT BEHÖVAS
    protected String namn;
    protected double längd;

    // KONSTRUKTORN FÖR ATT INITIALISERA VÄXTERNAS NAMN OCH LÄNGD
    public Krukväxter(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    // GETTERS FÖR ATT HÄMTA UPP INFORMATION OM VÄXTEN.
    public String getNamn() {
        return namn;
    }

    public double getLängd() {
        return längd;
    }

    /**
     * ABSTRAKTER SOM SKA IMPLEMENTERAS I SUBKLASSERNA,
     * DE RETURNERAR VAD FÖR SLAGS VATTEN ÄR LÄMPLIGT
     * FÖR DEN SPECIFIKA VÄXTEN SAMT EXAKT HUR MYCKET
     * AV DET VÄXTEN BEHÖVER
     */
    @Override
    public abstract double vattenBehov();

    @Override
    public abstract Vätska vatten();
}
