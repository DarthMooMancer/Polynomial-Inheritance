public class Main {
    public static void main(String[] args) {
        Polynomial polly = new Polynomial(5, 7);
        System.out.println(polly);

        Trinomial trinity = new Trinomial(4, 3, -5, 1);
        System.out.println(trinity);

        Quadratic quinn = new Quadratic(2, 5, -3);
        System.out.println(quinn);

        Polynomial pollySister = new Polynomial(5, 7);
        System.out.println(polly.equals(pollySister)); // true

        Trinomial trinityBrother = new Trinomial(4, 3, -5, 1);
        System.out.println(trinity.equals(trinityBrother)); // true

        Quadratic quinnSister = new Quadratic(2, 5, -3);
        System.out.println(quinn.equals(quinnSister)); // true
        System.out.println(quinn == quinnSister); // false
        System.out.println(quinn.hasRealSolutions()); // true
        System.out.println(quinn.firstZero()); // -0.75
        System.out.println(quinn.secondZero()); // -2.0
        System.out.println(quinn.isPerfectSquare()); // false

        Quadratic quinton = new Quadratic(9, 12, 4);
        System.out.println(quinton.isPerfectSquare()); // true
    }
}
