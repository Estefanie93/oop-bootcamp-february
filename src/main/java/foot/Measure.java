package foot;

public abstract class Measure {

    double value;
    double metroConversionFactor;

    public Measure(double metroConversionFactor, double value) {
        this.value = value;
        this.metroConversionFactor = metroConversionFactor;
    }

    double convertMetersTo() {
        return value * metroConversionFactor;
    }

    double convertToMeters() {
        return value / metroConversionFactor;
    }

    public double getValue() {
        return value;
    }

}
