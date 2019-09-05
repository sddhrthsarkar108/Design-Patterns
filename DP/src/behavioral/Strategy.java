package behavioral;

interface EatBehavior {
    void eat();
}

class NormalDiet implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("This is a normal diet");
    }
}

class ProteinDiet implements EatBehavior {
    @Override
    public void eat() {
        System.out.println("This is a protein diet");
    }
}

interface BarkBehavior {
    void bark();
}

class PlayfulBark implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("Bark! Bark!");
    }
}

class Growl implements BarkBehavior {
    @Override
    public void bark() {
        System.out.println("This is a growl");
    }
}

abstract class Dog {
    EatBehavior eatBehavior;
    BarkBehavior barkBehavior;

    public void doBark() {
        barkBehavior.bark();
    }

    public void doEat() {
        eatBehavior.eat();
    }

    public void setEatBehavior(EatBehavior eb) {
        eatBehavior = eb;
    }

    public void setBarkBehavior(BarkBehavior bb) {
        barkBehavior = bb;
    }
}

class Labrador extends Dog {
    public Labrador() {
        barkBehavior = new PlayfulBark();
        eatBehavior = new NormalDiet();
    }

    public void display() {
        System.out.println("I'm a playful Labrador");
    }
}

public class Strategy {
    public static void main(String[] args) {
        Dog lab = new Labrador();
        lab.doEat(); // Prints "This is a normal diet"
        lab.doBark(); // "Bark! Bark!"
        lab.setEatBehavior(new ProteinDiet());
    }
}
