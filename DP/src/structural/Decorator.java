package structural;

interface Phone {
    void printModel();
}

class BasicPhone implements Phone {
    @Override
    public void printModel() {
        System.out.println("Basic Phone");
    }
}

class PhoneDecorator implements Phone {
    Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void printModel() {
        // The wrapper object will delegate any incoming method calls to the original object,
        phone.printModel();
    }
}

// By using the decorator pattern, you can dynamically create as many decorated objects as you want,
// each enhancing the behavior of the original object in a unique way — and all without mutating the original object.
// In this manner, you can effectively add, remove, or extend behaviors at runtime.
class AndroidPhone extends PhoneDecorator {
    public AndroidPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void printModel() {
        super.printModel();
        System.out.println("Adding Features of Android");
    }
}

class IPhone extends PhoneDecorator {
    public IPhone(Phone phone) {
        super(phone);
    }

    @Override
    public void printModel() {
        super.printModel();
        System.out.println("Adding Features of iPhone");
    }
}

// By using the strategy pattern, you are necessarily changing the algorithm that an object uses for a given behavior.
// In some situations, it may be preferable not to mutate a given object. Or more likely,
// you won’t even have the option of mutating an object because it may come from a codebase over which you have no control (such as an external library).
public class Decorator {
    public static void main(String[] args) {
        System.out.println("Test 1\n");
        Phone phone = new AndroidPhone(new BasicPhone());
        phone.printModel();
        System.out.println("\nTest 2\n");
        Phone phone1 = new IPhone(phone);
        phone1.printModel();
    }
}
