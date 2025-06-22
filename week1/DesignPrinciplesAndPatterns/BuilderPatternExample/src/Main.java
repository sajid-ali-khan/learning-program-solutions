public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8 GB")
                .setOS("Ubuntu")
                .setBattery("4500MAH")
                .setDISK("256 GB")
                .setProcessor("64-bit")
                .build();

        computer.spec();
    }
}
