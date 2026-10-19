public class CalculatorTester {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("AX_Math - Calculator Functionality Tests");

        // basic math tests
        System.out.println("\nAddition");
        check("Addition", calc.add(47, 28), 75);

        System.out.println("\nSubtraction");
        check("Subtraction", calc.subtract(90, 37), 53);

        System.out.println("\nMultiplication");
        check("Multiplication", calc.multiply(12, 8), 96);

        System.out.println("\nDivision");
        check("Division", calc.divide(144, 12), 12);

        // remainder test
        System.out.println("\nModulus");
        check("Modulus", calc.modulus(29, 6), 5);

        System.out.println("\nExponential");
        check("Exponential", calc.exponential(4, 3), 64);

        System.out.println("\nSquare Root");
        check("Square Root", calc.squareRoot(225), 15);

        System.out.println("\nPercentage");
        check("Percentage", calc.percentage(450, 20), 90);

        // show how many tests passed or failed
        System.out.println("\nTest Summary");
        System.out.println("Tests Passed: " + passed);
        System.out.println("Tests Failed: " + failed);
        System.out.println("Total Tests: " + (passed + failed));

        if (failed == 0) {
            System.out.println("\nAll tests passed. AX_Math is ready.");
        } else {
            System.out.println("\nSome tests failed. Review required.");
        }
    }

    // compare the result with the expected answer
    private static void check(String name, double actual, double expected) {
        if (Double.isFinite(actual)
                && Math.abs(actual - expected) <= 0.000001) {
            passed++;
            System.out.println("[PASS] " + name + " = " + actual);
        } else {
            failed++;
            System.out.println("[FAIL] " + name
                    + " | Expected: " + expected
                    + " | Actual: " + actual);
        }
    }
}