package oop.command;

import oop.receiver.Editor;

public class Save implements Action {
    private final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
