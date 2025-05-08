class Quadratic extends Trinomial {
    private int discriminant;

    public Quadratic(int a, int b, int c) {
        super(2, a, b, c);
        this.discriminant = b * b - 4 * a * c;
    }

    public int getDiscriminant() {
        return discriminant;
    }

    public String toString() {
        return super.toString() + "\n" + getA() + "x^2 + " + getB() + "x + " + getC();
    }

    public boolean equals(Object other) {
        return super.equals(other);
    }

    public boolean hasRealSolutions() {
        return discriminant >= 0;
    }

    public double firstZero() {
        return (-getB() + Math.sqrt(discriminant)) / (2.0 * getA());
    }

    public double secondZero() {
        return (-getB() - Math.sqrt(discriminant)) / (2.0 * getA());
    }

    public boolean isPerfectSquare() {
        int a = getA();
        int b = getB();
        int c = getC();
        // check if a^2 + 2ab + b^2 == a x^2 + bx + c
        double sqrtA = Math.sqrt(a);
        double sqrtC = Math.sqrt(c);
        return discriminant == 0 && sqrtA == (int)sqrtA && sqrtC == (int)sqrtC && b == 2 * sqrtA * sqrtC;
    }
}
