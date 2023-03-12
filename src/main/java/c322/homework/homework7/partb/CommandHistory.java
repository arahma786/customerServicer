package c322.homework.homework7.partb;

public class CommandHistory {
    private Command[] history;
    private int index;

    public CommandHistory() {
        history = new Command[100];
        index = 0;
    }

    public void push(Command c) {
        if (index < history.length) {
            history[index] = c;
            index++;
        }
    }

    public Command pop() {
        if (index > 0) {
            index--;
            return history[index];
        }
        return null;
    }
}
