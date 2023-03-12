package c322.homework.homework7.partb;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public void execute() {
        app.clipBoard = editor.getSelection();
        editor.deleteSelection();
    }
}
