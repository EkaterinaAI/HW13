package HW13.Task2.src.memory;

import HW13.Task2.src.memory.TypeOM;

public class OperMemory {
    private TypeOM type;
    private double volume;
    private double weight;

    public OperMemory(TypeOM type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "OperMemory{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
