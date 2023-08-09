package HW13.Task2.src.hardDisc;

public class HardDisk {
    private TypeHD typeHD;
    private double volume;
    private double weight;

    public HardDisk(TypeHD typeHD, double volume, double weight) {
        this.typeHD = typeHD;
        this.volume = volume;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "typeHD=" + typeHD +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
