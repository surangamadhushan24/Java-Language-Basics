package calculatorProgram;

import java.util.Scanner;

public class Calculator  {

    float firstNumber;
    float secondNumber;

    public Calculator(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public float sum(){
        return firstNumber + secondNumber;
    }

    public float multiply(){
        return firstNumber * secondNumber;
    }

    public float subtraction(){
        return firstNumber - secondNumber;
    }

    public float division(){



        try {
            return firstNumber / secondNumber;
        }
        catch (Exception ex){
            throw ex;
        }


    }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//    The System.in parameter is used to take input from the standard input.
//    It works just like taking inputs from the keyboard

//    The Scanner class of the java.util package is used to read input data from
//    different sources like input streams, files, etc.

    System.out.println("Enter First Number: ");
    float firstNumber = input.nextFloat();
    System.out.println("Enter Second Number: ");
    float secondNumber = input.nextFloat();

    Calculator calculator = new Calculator(firstNumber,secondNumber);
    System.out.println(calculator.sum());
    System.out.println(calculator.subtraction());
    System.out.println(calculator.multiply());
    System.out.println(calculator.division());


}
}
