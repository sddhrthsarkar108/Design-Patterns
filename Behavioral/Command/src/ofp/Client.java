package ofp;

import oop.invoker.Macro;
import oop.receiver.Editor;
import oop.receiver.TextEditor;

public class Client {
    public static void main(String[] args) {
        Editor editor = new TextEditor();

        Macro macro = new Macro();
        // saves creating lot of individual command classes
        macro.record(() -> editor.open());
        macro.record(editor::save);
        macro.record(editor::close);

        macro.run();
    }
}
