public enum Unit implements Convertable {
    INCH(1), FOOT(12), YARD(36), FURLONG(7920), MILE(63360),
    LEAGUE(190080), FATHOM(22238.208), CABLE(2223820.8), NAUTICAL_MILE(22238208);

    private double baseQuantity;

    Unit(double baseQuantity) {
        this.baseQuantity = baseQuantity;
    }

    public double convertToBase(double quantity) {
        return baseQuantity * quantity;
    }
}