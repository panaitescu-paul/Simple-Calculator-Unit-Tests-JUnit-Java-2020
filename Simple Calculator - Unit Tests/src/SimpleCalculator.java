// Author: Paul Panaitescu
// Code inspired from: https://examples.javacodegeeks.com/desktop-java/ide/intellij-idea-create-test-tutorial/


public class SimpleCalculator {

    public float add(float n1, float n2) {
        return n1 + n2;
    }

    public float subtract(float n1, float n2) {
        return n1 - n2;
    }

    public float multiply(float n1, float n2) {
        return n1 * n2;
    }

    public float divide(float n1, float n2) throws ArithmeticException {
        if ((int) n2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return n1 / n2;
    }

}
