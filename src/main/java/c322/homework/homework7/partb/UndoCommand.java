package c322.homework.homework7.partb;

public class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public void execute() {
        app.undo();
    }
}
