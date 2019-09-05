package creational.factory;

// product
interface ITV {
    void display();
}

// With the Simple Factory, we try to abstract the creation details of the product from our caller.
// The only thing our caller knows, by calling a Static method and passing the desired parameter it, is that it returns an object of the TV type.
// whenever you see there are chances to create many implementations of a product go for the Simple factory.
public class SimpleFactory {
    enum TVMODE {
        COLOR, LED, LCD, THREEDIM
    }

    static ITV getTV(TVMODE mode) {
        if (mode.equals(TVMODE.LED)) {
            return () -> System.out.println("LED TV");
        }

        return null;
    }

    public static void main(String[] args) {
        SimpleFactory.getTV(TVMODE.LED).display();
    }
}
