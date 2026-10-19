
public class Calculator {

    // basic addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // subtract num2 from num1
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // don't allow division by 0
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    // get the remainder after dividing
    public double modulus(double first, double second) {
        double answer = first % second;
        return answer;
    }

    // raise the base to a power
    public double exponential(double base, double power) {
        return Math.pow(base, power);
    }

    // square root of the given number
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // calculate a percentage of a number
    public double percentage(double number, double percent) {
        double result = number * percent / 100;
        return result;
    }
}
