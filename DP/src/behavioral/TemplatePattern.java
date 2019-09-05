package behavioral;

import java.util.HashMap;
import java.util.Map;

class Computer {
    public Computer(final Map<String, String> computerParts) {

    }
}

abstract class ComputerBuilder {
    Map<String, String> computerParts = new HashMap<>();
    public final Computer buildComputer() {
        addMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    public abstract void addMotherboard();

    public abstract void addProcessor();
}

class StandardComputerBuilder extends ComputerBuilder {

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "Standard Motherboard");
    }

    @Override
    public void addProcessor() {
        computerParts.put("Processor", "Standard Processor");
    }
}

class HighEndComputerBuilder extends ComputerBuilder {
    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "High-end Motherboard");
    }

    @Override
    public void addProcessor() {
        computerParts.put("Processor", "High-end Processor");
    }
}

public class TemplatePattern {
}
