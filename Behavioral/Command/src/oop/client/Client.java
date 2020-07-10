package oop.client;

import oop.command.Close;
import oop.command.Open;
import oop.command.Save;
import oop.invoker.Macro;
import oop.receiver.Editor;
import oop.receiver.TextEditor;

public class Client {
    public static void main(String[] args) {
        Editor editor = new TextEditor();

        Macro macro = new Macro();
        macro.record(new Open(editor));
        macro.record(new Save(editor));
        macro.record(new Close(editor));

        macro.run();
    }
}
