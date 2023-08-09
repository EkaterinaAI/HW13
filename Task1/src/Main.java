package HW13.Task1.src;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator val = new ArithmeticCalculator(2,3);
        System.out.println(val.calculate(Operation.MULTIPLY));
    }
}