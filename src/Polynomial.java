class Polynomial {
    private int degree;
    private int terms;

    public Polynomial(int degree, int terms) {
	if(degree < 0) {
	    this.degree = 0;
	} else {
	    this.degree = degree;
	}
	this.terms = terms;
    }

    public int get_degree() {
	return this.degree;
    }

    public int get_terms() {
	return this.terms;
    }

    public String toString() {
	return String.format("Terms: %s, Degrees: %s", get_terms(), get_degree());
    }

    public boolean equals(Object obj) {
	if(this == obj) return true;
	if (obj == null || getClass() != obj.getClass()) return false;
        Polynomial other = (Polynomial) obj;
        return degree == other.degree && terms == other.terms;
    }
}
