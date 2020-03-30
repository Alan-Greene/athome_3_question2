package inclass_ex2;

public class MotherBoard {
    private String manufacturer;
    private int total_memory_capacity;
    private MemoryModule[] memory_modules;

    public MotherBoard(String manufacturer, int total_memory_capacity, int num_memory_modules){
        this.manufacturer = manufacturer;
        this.total_memory_capacity = total_memory_capacity;

        memory_modules = new MemoryModule[num_memory_modules];

        for (int i = 0; i < memory_modules.length; i++){
            memory_modules[i] = new MemoryModule(this.total_memory_capacity / num_memory_modules);
        }
    }

    public String toString() {
        String s = "Motherboard manufacturer: " + this.manufacturer + " containing: ";

        for (int i = 0; i < memory_modules.length; i++){
            s += "\nModule" + (i+1) + " " + memory_modules[i];
        }

        return s;

    }

    private class MemoryModule{
        private int capacity_of_memory_module_mb;

        public MemoryModule(int capacity_of_memory_module_mb){
            this.capacity_of_memory_module_mb = capacity_of_memory_module_mb;
        }

        public String toString() {
            return "size " + this.capacity_of_memory_module_mb + "MB";
    }
}

}
