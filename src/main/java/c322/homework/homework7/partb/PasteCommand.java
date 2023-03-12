package c322.homework.homework7.partb;

public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    public void execute() {
        editor.replaceSelection(app.clipBoard);
    }
}
