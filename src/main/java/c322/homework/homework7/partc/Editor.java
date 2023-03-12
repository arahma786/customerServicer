package c322.homework.homework7.partc;

public class Editor {
    private EventManager eventManager;

    public Editor() {
        eventManager = new EventManager();
    }

    public void openFile() {
        // do something
        eventManager.notify("fileOpen", "filename.txt");
    }

    public void saveFile() {
        // do something
        eventManager.notify("fileSave", "filename.txt");
    }
}
