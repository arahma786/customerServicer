package c322.homework.homework7.partb;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public void execute() {
        app.clipBoard = editor.getSelection();
    }
}
