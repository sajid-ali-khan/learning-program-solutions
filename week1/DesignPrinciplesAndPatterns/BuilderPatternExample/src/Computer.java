public class Computer {
    private String CPU;
    private String RAM;
    private String DISK;
    private String OS;
    private String Processor;
    private String Battery;
    private String GPU;

    Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.DISK = builder.DISK;
        this.OS = builder.OS;
        this.Processor = builder.Processor;
        this.Battery = builder.Battery;
        this.GPU = builder.GPU;
    }

    public static class Builder{
        private String CPU;
        private String RAM;
        private String DISK;
        private String Processor;
        private String Battery;
        private String GPU;
        private String OS;

        public Builder setCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM){
            this.RAM = RAM;
            return this;
        }

        public Builder setDISK(String DISK){
            this.DISK = DISK;
            return this;
        }

        public Builder setOS(String OS){
            this.OS = OS;
            return this;
        }

        public Builder setProcessor(String Processor){
            this.Processor = Processor;
            return this;
        }

        public Builder setBattery(String Battery){
            this.Battery = Battery;
            return this;
        }

        public Builder setGPU(String GPU){
            this.GPU = GPU;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public void spec(){
        String str = String.format(
                "CPU = %s\n" + "RAM = %s\n"
                 + "OS = %s\n"
                + "DISK = %s\n" + "Processor = %s\n"
                + "Battery = %s\n" + "GPU = %s\n",
                CPU, RAM, OS, DISK, Processor, Battery, GPU
        );
        System.out.println(str);
    }
}
