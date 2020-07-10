package oop.invoker;

import oop.command.Action;

import java.util.ArrayList;
import java.util.List;

public class Macro {
    private final List<Action> actions;

    public Macro() {
        this.actions = new ArrayList<>();
    }

    public void record(Action todo) {
        actions.add(todo);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
