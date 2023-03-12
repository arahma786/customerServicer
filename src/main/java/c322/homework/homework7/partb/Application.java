package c322.homework.homework7.partb;

public class Application {
    public Editor[] editors;
    public Editor activeEditor;
    String clipBoard;
    CommandHistory history;

    public void createUI() {
        // Implementation of the createUI method goes here
        // ...
    }

    public void executeCommand(Command c) {
        c.saveBackup();
        c.execute();
        history.push(c);
    }

    public void undo() {
        Command c = history.pop();
        if (c != null) {
            c.undo();
        }
    }
}
