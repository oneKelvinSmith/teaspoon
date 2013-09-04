//understands length as a unit of measure for distance
public class Length {
    private final double quantity;
    private final Unit unit;

    public Length(double quantity, Unit unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Length))
            return false;
        Length anotherLength = (Length) other;
        return unit.convertToBase(quantity)
                == anotherLength.unit.convertToBase(anotherLength.quantity);
    }

    @Override
    public int hashCode() {
        return new Double(quantity).hashCode();
    }

}
