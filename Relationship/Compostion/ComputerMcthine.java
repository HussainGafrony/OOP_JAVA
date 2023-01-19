package Relationship.Compostion;

public class ComputerMcthine {
    private CPU cpu;
    private Ram ram;

    public ComputerMcthine(CPU cpu, Ram ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String dashboard() {
        return "My Machine`s speed is " + this.cpu.getSpeed() + "GHZ and a RAM of" + this.ram.getSize() + "GB";
    }

}
