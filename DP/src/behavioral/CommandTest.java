package behavioral;

// receiver
class Television {
    public void turnOn() {
        System.out.println("The Television on prepare to numb your brains!");
    }

    public void turnOff() {
        System.out.println("The TV is off, go outside!");
    }
}

interface Command {
    void execute();
}

// concrete command for receiver
class OnCommand implements Command {
    private Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.turnOn();
    }
}

class OffCommand implements Command {
    private Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.turnOff();
    }
}

// Command pattern allows us to decouple requester of an action from the object that performs the action.
// A command object encapsulates a request to do something on a specific object.
// The requester just communicates with command objects with standard interface without knowing how each command object internally performs action on a specific object
class Remote {
    private Command onCommand;
    private Command offCommand;

    Remote(Command onComand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    void on() {
        onCommand.execute();
    }

    void off() {
        offCommand.execute();
    }
}

public class CommandTest {
    public static void main(String[] args) {
        Television television = new Television();
        Command onCommand = new OnCommand(television);
        Command offCommand = new OffCommand(television);
        Remote remote = new Remote(onCommand, offCommand);

        remote.on();
    }
}
