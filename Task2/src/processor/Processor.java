package HW13.Task2.src.processor;

import HW13.Task2.src.processor.Chastota;
import HW13.Task2.src.processor.CountJ;
import HW13.Task2.src.processor.Proizv;

public class Processor {
    private Chastota chastota;
    private CountJ countJ;
    private Proizv proizv;
    private double weight;

    public Processor(Chastota chastota, CountJ countJ, Proizv proizv, double weight) {
        this.chastota = chastota;
        this.countJ = countJ;
        this.proizv = proizv;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "chastota=" + chastota +
                ", countJ=" + countJ +
                ", proizv=" + proizv +
                ", weight=" + weight +
                '}';
    }
}
