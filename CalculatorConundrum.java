class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) { super(errorMessage); }
    public IllegalOperationException(String errorMessage, Throwable cause) { super(errorMessage, cause); }
}

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("La operación no puede ser nula");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("La operación no puede estar vacía");
        }

        int result;
        switch (operation) {
            case "+": 
                result = operand1 + operand2; 
                break;
            case "*": 
                result = operand1 * operand2; 
                break;
            case "/":
                if (operand2 == 0) {
                    throw new IllegalOperationException("La división por cero no está permitida", new ArithmeticException());
                }
                result = operand1 / operand2; 
                break;
            default: 
                throw new IllegalOperationException("La operación '" + operation + "' no existe");
        }
        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}
    

