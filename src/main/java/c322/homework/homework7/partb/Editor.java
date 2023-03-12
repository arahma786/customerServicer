package c322.homework.homework7.partb;

public class Editor {
    String text;

    public String getSelection() {
        return text; // Returns the entire text as selection
    }

    public void deleteSelection() {
        text = ""; // Deletes the entire text
    }

    public void replaceSelection(String text) {
        this.text = text; // Replaces the entire text with given text
    }
}
