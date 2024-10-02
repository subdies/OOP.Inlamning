public enum Vätska {
    KRANVATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten"),
    PROTEINDRYCK("proteindryck"),
    ;

    private final String namn;

    Vätska(String namn) {
        this.namn = namn;
    }
    public String getNamn() {
        return namn;
    }
}
