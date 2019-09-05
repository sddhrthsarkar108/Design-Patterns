package creational.factory.af;

interface Wheel {
    String getDescription();
}

class CarWheel implements Wheel {
    public String getDescription() {
        return "I am a car wheel";
    }
}

class BikeWheel implements Wheel {
    public String getDescription() {
        return "I am a bike wheel";
    }
}

interface WheelFittingExpert {
    String getDescription();
}

class CarExpert implements WheelFittingExpert {
    public String getDescription() {
        return "I can only fit car wheels";
    }
}

class BikeExpert implements WheelFittingExpert {
    public String getDescription() {
        return "I can only fit bike wheels";
    }
}


// The Abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
interface WheelFactory {
    Wheel makeWheel();
    WheelFittingExpert makeFittingExpert();
}

// Car Wheel factory to return car wheel and car expert
class CarWheelFactory implements WheelFactory {
    public Wheel makeWheel() {
        return new CarWheel();
    }

    public WheelFittingExpert makeFittingExpert() {
        return new CarExpert();
    }
}

// Bike Wheel factory to return bike wheel and bike expert
class BikeWheelFactory implements WheelFactory {
    public Wheel makeWheel() {
        return new BikeWheel();
    }

    public WheelFittingExpert makeFittingExpert() {
        return new BikeExpert();
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        // The Abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.
        // When there are interrelated dependencies with not-that-simple creation logic involved.
        WheelFactory carWheelFactory = new CarWheelFactory();
        Wheel carWheel = carWheelFactory.makeWheel();
        WheelFittingExpert carExpert = carWheelFactory.makeFittingExpert();
        System.out.println(carWheel.getDescription()); // I am a car wheel
        System.out.println(carExpert.getDescription()); // I can only fit car wheels
        // Same for the Bike wheel
        WheelFactory bikeWheelFactory = new BikeWheelFactory();
        Wheel bikeWheel = bikeWheelFactory.makeWheel();
        WheelFittingExpert bikeExpert = bikeWheelFactory.makeFittingExpert();

        System.out.println(bikeWheel.getDescription()); // I am a bike wheel
        System.out.println(bikeExpert.getDescription()); // I can only fit bike wheels
    }
}



