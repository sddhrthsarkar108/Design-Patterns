package japi;

public class StrategyUsingEnum {
    public static void main(String[] args) {
        Player ctx = new Player(Strategy.T20);
        ctx.setStrategy(Strategy.ONE_DAY);
        ctx.play();
        ctx.setStrategy(Strategy.TEST);
        ctx.play();
    }
}

class Player {
    private Strategy battingStrategy;

    public Player(Strategy battingStrategy) {
        this.battingStrategy = battingStrategy;
    }

    public void setStrategy(Strategy newStrategy) {
        this.battingStrategy = newStrategy;
    }

    public void play(){
        battingStrategy.play();
    }
}

// adding a new strategy violates open close principle
enum Strategy {
    T20 {
        @Override public void play() {
            System.out.printf("In %s, If it's in the V, make sure it goes to tree %n", name());
        }
    },
    ONE_DAY {
        @Override public void play() {
            System.out.printf("In %s, Push it for Single %n", name());
        }
    },
    TEST {
        @Override public void play() {
            System.out.printf("In %s, Grind them hard %n", name());
        }
    };

    public void play() {
        System.out.printf("In Cricket, Play as per Merit of Ball %n");
    }
}
