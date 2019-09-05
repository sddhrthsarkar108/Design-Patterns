package creational.factory.fm;

interface ITV {
    void display();
}

abstract class AbstractFactory {
    final void orderTV() {
        createTV();
        int charge = shippingCharge();
        System.out.println("Shipping charge: " + charge + " INR");
    }

    protected abstract int shippingCharge();

    protected abstract void createTV();
}

class LEDTVFactory extends AbstractFactory {
    @Override
    public int shippingCharge() {
        return 1000;
    }

    @Override
    public void createTV() {
        new ITV() {
            @Override
            public void display() {
                System.out.println("LED TV");
            }
        };
    }
}

// Use the Factory method if the business requirements are more than just product creation.
// To be precise, if you want to control product creation steps and want to control every step, and steps are customized,
public class FactoryMethod {
    public static void main(String[] args) {
        AbstractFactory factory = new LEDTVFactory();
        factory.orderTV();
    }
}
