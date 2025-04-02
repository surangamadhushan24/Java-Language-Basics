package calculatorProgram;

public class CommandLineArgumentsCal {
    private final float firstNumber;
    private final float secondNumber;

    public CommandLineArgumentsCal(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public float sum() {
        return firstNumber + secondNumber;
    }

    public float subtract() {
        return firstNumber - secondNumber;
    }

    public float multiply() {
        return firstNumber * secondNumber;
    }

    public  float divide() {
        if (secondNumber == 0){
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return firstNumber /secondNumber;
    }

    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: java Calculator <number1> <operator> <number2>");
            System.out.println("Operators: +, -, *, /");
            return;

        }

        try{

            float firstNumber = Float.parseFloat(args[0]);
            String operator = args[1];
            float secondNumber = Float.parseFloat(args[2]);

            var cal = new CommandLineArgumentsCal(firstNumber,secondNumber);

            float result;

            switch (operator){
                case ("+"):
                   result = cal.sum();
                   break;

                case ("-"):
                    result = cal.subtract();
                    break;

                case ("*"):
                    result = cal.multiply();
                    break;

                case ("/"):
                    result = cal.divide();
                    break;

                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.printf("Result: %.2f %s %.2f = %.2f%n",
                    firstNumber, operator, secondNumber, result);

        }
        catch (NumberFormatException e){
            System.out.println("Error: Please provide valid numbers");
        }
        catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }


}
