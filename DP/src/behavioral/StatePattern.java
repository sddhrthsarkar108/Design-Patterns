package behavioral;
// State pattern contains a state interface that contains method for every action on the context.
interface State {
    void verifyCreditCard(String info);
    void ship();
    void orderDelivered();
}

class UnpaidState implements State {
    private Order order;

    UnpaidState(Order order) {
        this.order = order;
    }

    public void verifyCreditCard(String info) {
        order.setState(order.getPaidState());
    }

    public void ship() {
        System.out.println("Sorry can't ship an item unless it's paid");
    }

    public void orderDelivered() {
        System.out.println("Order hasn't shipped yet!");
    }

}

// context
class Order {
    State unpaidState;
    State paidState;
    State shippedState;
    State deliveredState;

    State state = unpaidState;

    public Order() {
        unpaidState = new UnpaidState(this);
        //paidState = new PaidState(this);
        //shippedState = new ShippedState(this);
        //deliveredState = new DeliveredState(this);
    }

    // Context class should delegate work to the current state class and current state class handle the state transition.
    // Context gets its behavior by delegating to current state object.
    public void verifyCreditCard(String info) {
        state.verifyCreditCard(info);
    }

    public void ship() {
        state.ship();
    }

    public void orderDelivered() {
        state.orderDelivered();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getPaidState() {
        return paidState;
    }
}

public class StatePattern {
}
