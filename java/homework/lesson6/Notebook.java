public class Notebook {

    private int ram;
    private int cpu;
    private int hdd;
    private String os;
    private String colour;
    private double price;

    public Notebook(int ram, int cpu, int hdd, String os, String colour, double price) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public int getCpu() {
        return cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "[ram: " + ram + "; cpu: " + cpu + "; hdd: " + hdd + "; os: " + os + "; colour: " + colour + "; price: "
                + price + "]";
    }
}
