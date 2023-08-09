package HW13.Task1.src;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ArithmeticCalculator {
    private int num1;
    private int num2;

    public ArithmeticCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int calculate(Operation operation) {
        int result = 0;
        switch (operation){
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
        }
        return result;
    }
}
