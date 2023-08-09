package HW13.Task2.src;

import HW13.Task2.src.hardDisc.HardDisk;
import HW13.Task2.src.hardDisc.TypeHD;
import HW13.Task2.src.memory.OperMemory;
import HW13.Task2.src.memory.TypeOM;
import HW13.Task2.src.processor.Chastota;
import HW13.Task2.src.processor.CountJ;
import HW13.Task2.src.processor.Processor;
import HW13.Task2.src.processor.Proizv;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Chastota.ABC, CountJ.FN, Proizv.JDSF, 21);
        OperMemory operMemory = new OperMemory(TypeOM.B, 12, 45);
        HardDisk hardDisk = new HardDisk(TypeHD.HDD, 45, 78);

        Computer computer = new Computer(processor, operMemory, hardDisk);

        System.out.println(computer.commonWeight());
        System.out.println(computer);
    }
}
