package c322.homework.homework7.partb;

public abstract class Command {
    Application app;
    Editor editor;
    String backup;

    public Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    public void saveBackup() {
        backup = editor.text;
    }

    public void undo() {
        editor.text = backup;
    }

    public abstract void execute();
}
