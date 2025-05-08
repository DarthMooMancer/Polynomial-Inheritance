class Trinomial extends Polynomial {
    private int a, b, c;

    public Trinomial(int degree, int a, int b, int c) {
	super(degree, 3);
	this.a = a;
	this.b = b;
	this.c = c;
    }

    public int getA() {
	return a;
    }

    public int getB() {
	return b;
    }

    public int getC() {
	return c;
    }

    public String toString() {
	return super.toString() + "\nThis Trinomial has coefficients of " + a + " " + b + " " + c;
    }

    public boolean equals(Object other) {
	if (!(other instanceof Trinomial)) return false;
	Trinomial t = (Trinomial) other;
	return super.equals(t) && a == t.a && b == t.b && c == t.c;
    }
}
