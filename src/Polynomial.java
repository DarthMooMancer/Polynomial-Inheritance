class Polynomial {
    private int degree;
    private int terms;

    public Polynomial(int degree) {
	if(degree < 0) {
	    this.degree = 0;
	} else {
	    this.degree = degree;
	}
    }

    public int get_degree() {
	return this.degree;
    }

    public int get_terms() {
	return this.terms;
    }
}
