public class Calculator {
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case Operation.ADDITION:
                return firstOperand + secondOperand;
            case Operation.SUBTRACTION:
                return firstOperand - secondOperand;
            case Operation.MULTIPLICATION:
                return firstOperand * secondOperand;
            case Operation.DIVISION:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}