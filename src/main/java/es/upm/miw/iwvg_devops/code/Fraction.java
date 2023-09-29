package es.upm.miw.iwvg_devops.code;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.numerator < this.denominator;
    }

    public boolean isImproper() {
        return this.numerator >= this.denominator;
    }

    public boolean equivalent(Fraction fraction) {
        return this.numerator * fraction.getDenominator() == this.denominator * fraction.getNumerator();
    }

    public void add(Fraction fraction) {
        this.numerator = this.numerator * fraction.getDenominator() + this.denominator * fraction.getNumerator();
        this.denominator = this.denominator * fraction.getDenominator();
    }

    public void multiply(Fraction fraction) {
        this.numerator = this.numerator * fraction.getNumerator();
        this.denominator = this.denominator * fraction.getDenominator();
    }

    public void divide(Fraction fraction) {
        this.numerator = this.numerator * fraction.getDenominator();
        this.denominator = this.denominator * fraction.getNumerator();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
