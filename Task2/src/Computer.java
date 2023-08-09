package HW13.Task2.src;


import HW13.Task2.src.hardDisc.HardDisk;
import HW13.Task2.src.memory.OperMemory;
import HW13.Task2.src.processor.Processor;

public class Computer {
    private Processor processor;
    private OperMemory operMemory;
    private HardDisk hardDisk;

    private static final String vendor = "kjhk";
    private static final String name = "oskfjsd";

    public Computer(Processor processor, OperMemory operMemory, HardDisk hardDisk) {
        this.processor = processor;
        this.operMemory = operMemory;
        this.hardDisk = hardDisk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public OperMemory getOperMemory() {
        return operMemory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setOperMemory(OperMemory operMemory) {
        this.operMemory = operMemory;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public double commonWeight() {
        return processor.getWeight() + operMemory.getWeight() + hardDisk.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", operMemory=" + operMemory +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
